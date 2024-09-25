package com.example;

import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        // Create a DataProcessor instance for Integer data
        DataProcessor<Integer> intProcessor = new DataProcessor<>();

        // Create an array of Integer data
        Integer[] intData = {4, 2, 7, 1, 3};

        // Sort the data in ascending order using the natural ordering
        intData = intProcessor.sortData(intData);

        // Search for an element in the sorted data
        int index = intProcessor.searchData(intData, 3);
        System.out.println("Index of 3: " + index);

        // Create a custom comparator for String data
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };

        // Create a DataProcessor instance for String data
        DataProcessor<String> stringProcessor = new DataProcessor<>();

        // Create an array of String data
        String[] stringData = {"hello", "world", "abc", "def", "ghi"};

        // Sort the data in ascending order using the custom comparator
        stringData = stringProcessor.sortData(stringData, stringComparator);

        // Search for an element in the sorted data using the custom comparator
        index = stringProcessor.searchData(stringData, "def", stringComparator);
        System.out.println("Index of 'def': " + index);
    }
}