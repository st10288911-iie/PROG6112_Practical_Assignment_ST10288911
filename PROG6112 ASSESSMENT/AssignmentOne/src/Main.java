/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Student> students = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            // Display menu options
            // code attribution - https://www.codeease.net/programming/java/creating-a-menu-in-java
            System.out.println("STUDENT MANAGEMENT APPLICATION");
            System.out.println("Enter (1) to launch menu or any other key to exit");
            System.out.println("Please select one of the following menu items: ");
            System.out.println("1. Capture a new student");
            System.out.println("2. Search for a student");
            System.out.println("3. Delete a student");
            System.out.println("4. Print student report");
            System.out.println("5. Exit Application");
            System.out.print("Enter your choice: ");
            // Get user input
            choice = scanner.nextInt();
            scanner.nextLine();

            // Process user choice
            switch (choice) {
                case 1:
                    System.out.println("You selected Option 1");
                    System.out.println(saveStudent()); // Call saveStudent to capture student details
                    break;
                case 2:
                    System.out.println("You selected Option 2");
                    System.out.println(searchStudent());// Call saveStudent to search for student
                    break;
                case 3:
                    System.out.println("You selected Option 3");
                    System.out.println(deleteStudent());// Call deleteStudent to delete a student
                    break;
                case 4:
                    System.out.println("You selected Option 4");
                    StudentReport(); // Call printStudentReport to display all students entered/saved
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

            System.out.println();
        } while (choice != 5);
        // Close the scanner
        scanner.close();
    }

    //save student method
    public static String saveStudent() {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        // Capturing the age and validating it
        while (true) {
            System.out.print("Enter student age: ");
            if (scanner.hasNextInt()) {
                int age = scanner.nextInt();
                if (age >= 16) {
                    break; // Exit loop if age is correctt
                } else {
                    return ("Invalid age. Age must be 16 or older.");
                }
            } else {
                return ("Invalid input. Please enter a number for age.");
                //scanner.next(); // Clear invalid input
            }
        }
        scanner.nextLine();
        System.out.print("Enter student email: ");
        String email = scanner.nextLine();
        System.out.print("Enter student course: ");
        String course = scanner.nextLine();
        int age = 0;

        Student student = new Student(id, name, age, email, course);
        students.add(student); // Add student to the list

        return ("Student saved: " + student);

    }

    //search student method
    public static String searchStudent() {
        System.out.print("Enter student ID to search for: ");

        // Check for valid integer input
        int id;
        if (scanner.hasNextInt()) {
            id = scanner.nextInt();
            scanner.nextLine();

            // Search for the student by student ID
            boolean found = false;
            for (Student student : students) {
                if (student.getId() == id) {
                    return ("Student found: " + student.getName());
                    // found = true;
                    // break;
                }
            }

            if (!found) {
                return ("Student with ID " + id + " not found.");
            }
        } else {
            return ("Invalid input. Please enter a valid integer for student ID.");
            //scanner.next(); 
        }
        return null;
    }

    //delete student method
    public static String deleteStudent() {
        System.out.print("Enter student ID to delete: ");

        // Check for valid integer input
        int id;
        if (scanner.hasNextInt()) {
            id = scanner.nextInt();
            scanner.nextLine();

            // Find student to delete
            Student studentToDelete = null;
            for (Student student : students) {
                if (student.getId() == id) {
                    studentToDelete = student;
                    break;
                }
            }

            if (studentToDelete != null) {
                System.out.println("Student found: " + studentToDelete);
                System.out.print("Are you sure you want to delete this student? (yes/no): ");
                String confirmation = scanner.nextLine();
                if (confirmation.equalsIgnoreCase("yes")) {
                    students.remove(studentToDelete);
                    return ("Student deleted.");
                } else {
                    return ("Deletion cancelled.");
                }
            } else {
                return ("Student with ID " + id + " not found.");
            }
        } else {
            return ("Invalid input. Please enter a valid integer for student ID.");

        }
    }

    //student report method
    private static void StudentReport() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("Student Report:");
            for (Student student : students) {
                System.out.println(student); // Print each student's details
            }
        }
    }
}
