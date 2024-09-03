/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salaryapp;

public class Worker {
    private String name;
    private double hourlyWage;
    private double hoursWorked;

    public Worker(String name, double hourlyWage, double hoursWorked) {
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double calculateWeeklySalary() {
        return this.hourlyWage * this.hoursWorked;
    }

    public double calculateMonthlySalary() {
        // Assuming that there is 4 weeks in a month
        return calculateWeeklySalary() * 4;
    }
}
