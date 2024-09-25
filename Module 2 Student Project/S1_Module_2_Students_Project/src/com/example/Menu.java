package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Menu implements Iterable<MenuItem> {
    private ArrayList<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }

    public void sort(Comparator<? super MenuItem> comparator) {
        items.sort(comparator);
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return items.iterator();
    }
}