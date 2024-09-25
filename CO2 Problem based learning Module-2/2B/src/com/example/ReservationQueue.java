package com.example;
import java.util.PriorityQueue;
import java.util.Queue;

public class ReservationQueue {
    private Queue<BookReservation> queue;

    public ReservationQueue() {
        this.queue = new PriorityQueue<>();
    }

    public void addReservation(BookReservation reservation) {
        queue.add(reservation);
    }

    public BookReservation processNextReservation() {
        return queue.poll();
    }

    public static class BookReservation implements Comparable<BookReservation> {
        private String userId;
        private String bookTitle;
        private int priority; // higher value means higher priority

        public BookReservation(String userId, String bookTitle, int priority) {
            this.userId = userId;
            this.bookTitle = bookTitle;
            this.priority = priority;
        }

        public String getUserId() {
            return userId;
        }

        public String getBookTitle() {
            return bookTitle;
        }

        @Override
        public int compareTo(BookReservation other) {
            return Integer.compare(this.priority, other.priority);
        }
    }
}