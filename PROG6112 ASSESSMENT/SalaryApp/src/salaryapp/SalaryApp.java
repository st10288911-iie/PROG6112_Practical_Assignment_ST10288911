
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salaryapp;
import java.util.Scanner;
import salaryapp.Worker;

public class SalaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter worker details
        System.out.print("Enter the worker's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the hourly wage for the worker: ");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter the hours the worker worked in a week: ");
        double hoursWorked = scanner.nextDouble();

        // Create a Worker object with the entered details
        Worker worker = new Worker(name, hourlyWage, hoursWorked);

        // Prompt the user to choose the salary type to calculate
        System.out.println("Which salary would you like to calculate?");
        System.out.println("1. Weekly Salary");
        System.out.println("2. Monthly Salary");
        int choice = scanner.nextInt();

        // Calculate and display the chosen salary
        switch (choice) {
            case 1:
                double weeklySalary = worker.calculateWeeklySalary();
                System.out.printf("Weekly Salary for %s: R%.2f%n", worker.getName(), weeklySalary);
                break;
            case 2:
                double monthlySalary = worker.calculateMonthlySalary();
                System.out.printf("Monthly Salary for %s: R%.2f%n", worker.getName(), monthlySalary);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}

