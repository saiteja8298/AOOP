package com.example;

import java.util.Arrays;
import java.util.List;

public class Sorting_Strings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "abc", "def", "ghi");
        DataProcessor<String> processor = new DataProcessor<>(strings);
        processor.sort();
        System.out.println(strings); // [abc, def, ghi, hello, world]
    }
}