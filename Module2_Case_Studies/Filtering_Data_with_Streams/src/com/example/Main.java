package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; 
public class Main {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 80.0));
        students.add(new Student("Alice", 60.0));
        students.add(new Student("Bob", 40.0));
        students.add(new Student("Eve", 90.0));
        students.add(new Student("Charlie", 30.0));

        // Filter out students with failing grades (less than 60)
        List<Student> passingStudents = students.stream()
                .filter(student -> student.getGrade() >= 60)
                .collect(Collectors.toList());

        // Print the passing students
        System.out.println("Passing Students:");
        passingStudents.forEach(student -> System.out.println(student.getName() + " - " + student.getGrade()));
    }
}
