package com.example;
import java.util.List;
import java.util.stream.Collectors;

public class SquareValues {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Use Stream API to convert the list to square values
        List<Integer> squareValues = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Square values: " + squareValues);
    }
}