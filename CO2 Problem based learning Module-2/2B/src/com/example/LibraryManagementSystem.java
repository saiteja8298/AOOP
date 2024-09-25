package com.example;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        ReservationQueue queue = new ReservationQueue();

        queue.addReservation(new ReservationQueue.BookReservation("user1", "Book A", 3));
        queue.addReservation(new ReservationQueue.BookReservation("user2", "Book B", 2));
        queue.addReservation(new ReservationQueue.BookReservation("user3", "Book C", 1));

        while (true) {
            ReservationQueue.BookReservation nextReservation = queue.processNextReservation();
            if (nextReservation == null) {
                break;
            }
            System.out.println("Next reservation: " + nextReservation.getUserId() + " - " + nextReservation.getBookTitle());
        }
    }
}