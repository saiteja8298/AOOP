package com.example;

public class EmployeeManagement {
    private java.util.ArrayList<Employee> employees;

    public EmployeeManagement() {
        this.employees = new java.util.ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void sortById() {
        java.util.Collections.sort(employees);
    }

    public void sortByName(EmployeeComparator comparator) {
        java.util.Collections.sort(employees, comparator);
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}