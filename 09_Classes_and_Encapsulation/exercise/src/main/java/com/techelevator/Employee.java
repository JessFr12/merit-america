package com.techelevator;

public class Employee {

    private String lastName;
    private String department;
    private int employeeId;
    private double annualSalary;
    private String firstName;

    public Employee(int employeeId, String firstName, String lastName,double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = "";
        this.annualSalary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return lastName + ", " + firstName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void raiseSalary(double percent) {
        double raiseAmount = annualSalary * (percent / 100);
        annualSalary += raiseAmount;
    }


}
