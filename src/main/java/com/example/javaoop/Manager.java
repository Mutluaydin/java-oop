package com.example.javaoop;

import java.util.ArrayList;

public class Manager extends Employee implements IManager{
    // A Manager has numberOfEmployeesSupervised attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager
    private ArrayList<Employee> employees = new ArrayList<>();

    public Manager(int id, String firstName, String lastName, int age, int salary, String department) {
        super(id, firstName, lastName, age, salary, department);
    }

    public Manager() {
    }

    @Override
    public void getNumberOfEmployeesSupervised() {
        System.out.println(getFirstName() + " has " + employees.size() + " employees." );
    }

    @Override
    public void hireEmployee(Employee employee) {
        System.out.println(employee.getFirstName() + " is hired!");
        employees.add(employee);
    }

    @Override
    public void increaseSalary(Employee employee, double amount) {
        employee.setSalary(employee.getSalary() + amount);
        System.out.println(employee.getFirstName() + " " + employee.getLastName()+ "'s salary is increased"+ amount + "CHF. New Salary :"+ employee.getSalary());
    }

    @Override
    public void fireEmployee(Employee employee) {
        System.out.println(employee.getFirstName() + " is fired!");
        employees.remove(employee);
    }

    @Override
    public void getEmployees(){
        System.out.println(getFirstName() + " " + getLastName() + "'s employees :");
        for (Employee employee : employees){
            System.out.println(employee.getFirstName() + " " + employee.getLastName());
        }
    }
}
