package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Custom_Comparator {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "abc", "def", "ghi");
        DataProcessor<String> processor = new DataProcessor<>(strings);
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };
        processor.sort(comparator);
        System.out.println(strings); // [abc, def, ghi, hello, world]
    }
}