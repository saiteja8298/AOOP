package com.example;
import java.util.Iterator;
public class MenuIterator implements Iterator<MenuItem> {
    private Iterator<MenuItem> iterator;

    public MenuIterator(Menu menu) {
        this.iterator = menu.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public MenuItem next() {
        return iterator.next();
    }
}