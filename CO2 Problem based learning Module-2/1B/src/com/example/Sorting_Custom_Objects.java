package com.example;

import java.util.Arrays;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return this.age - other.age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Sorting_Custom_Objects {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("John", 25),
            new Person("Jane", 30),
            new Person("Bob", 20)
        );
        DataProcessor<Person> processor = new DataProcessor<>(people);
        processor.sort();
        for (Person person : people) {
            System.out.print(person + " ");
        }
        System.out.println(); // Bob (20) John (25) Jane (30)
    }
}