package com.example;

import java.util.Deque;
import java.util.LinkedList;

public class BookStack<T> {
    private Deque<T> stack;

    public BookStack() {
        this.stack = new LinkedList<>();
    }

    public void push(T book) {
        stack.push(book);
    }

    public T pop() {
        return stack.isEmpty() ? null : stack.pop();
    }

    public T peek() {
        return stack.isEmpty() ? null : stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}