package com.java100.day4;

class Employee {
    // Attributes
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to calculate annual salary
    double calculateAnnualSalary() {
        return salary * 12;
    }
}

class Manager extends Employee {
    double bonus;

    // Constructor
    Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary); // Calling the superclass constructor
        this.bonus = bonus;
    }

    // Override method to calculate total annual salary including bonus
    @Override
    double calculateAnnualSalary() {
        return (salary * 12) + bonus;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("John Doe", 101, 3000);
        System.out.println("Employee Annual Salary: " + emp.calculateAnnualSalary());

        // Create a Manager object
        Manager mgr = new Manager("Jane Smith", 102, 5000, 10000);
        System.out.println("Manager Total Annual Salary (including bonus): " + mgr.calculateAnnualSalary());
    }
}
