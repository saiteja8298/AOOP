package com.example;

public class Employee implements java.lang.Cloneable, java.lang.Comparable<Employee> {
    private int id;
    private java.lang.String name;
    private double salary;

    public Employee(int id, java.lang.String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public java.lang.String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        return this.id - other.id;
    }

    @Override
    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public java.lang.String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
