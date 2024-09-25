package com.example;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        MenuItem item1 = new MenuItem("Burger", 10.99, "Juicy beef burger");
        MenuItem item2 = new MenuItem("Pizza", 12.99, "Delicious cheese pizza");
        MenuItem item3 = new MenuItem("Salad", 8.99, "Fresh green salad");

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);

        System.out.println("Original Menu:");
        for (MenuItem item : menu) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }

        menu.sort(new Comparator<MenuItem>() {
            @Override
            public int compare(MenuItem o1, MenuItem o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });

        System.out.println("\nSorted Menu by Price:");
        for (MenuItem item : menu) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
    }
}