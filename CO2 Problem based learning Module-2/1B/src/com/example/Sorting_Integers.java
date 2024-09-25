package com.example;

import java.util.Arrays;
import java.util.List;

public class Sorting_Integers {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 2, 8, 3, 1, 4);
        DataProcessor<Integer> processor = new DataProcessor<>(integers);
        processor.sort();
        System.out.println(integers); // [1, 2, 3, 4, 5, 8]
    }
}