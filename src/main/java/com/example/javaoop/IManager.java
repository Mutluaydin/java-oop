package com.example.javaoop;

public interface IManager {
    void getNumberOfEmployeesSupervised();

    void hireEmployee(Employee employee);

    void increaseSalary(Employee employee, double amount);

    void fireEmployee(Employee employee);

    void getEmployees();
    // A Manager can increaseSalary, hireEmployee, fireEmployee, and getNumberOfEmployeesSupervised
    // Please implement these methods
}
