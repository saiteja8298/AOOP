package com.example;

public class Main {
    public static void main(String[] args) {
        BookStack<String> bookStack = new BookStack<>();

        bookStack.push("Book 1");
        bookStack.push("Book 2");
        bookStack.push("Book 3");

        System.out.println("Stack size: " + bookStack.size());

        String topBook = bookStack.pop();
        System.out.println("Popped book: " + topBook);

        String peekedBook = bookStack.peek();
        System.out.println("Peeked book: " + peekedBook);

        System.out.println("Is stack empty? " + bookStack.isEmpty());
    }
}