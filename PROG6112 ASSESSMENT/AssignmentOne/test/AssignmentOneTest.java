
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AssignmentOneTest {

    public AssignmentOneTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    
    @Test
    public void testMain() {
        System.out.println("main");
        // String[] args = null;
        //AssignmentOne.main(args);

    }

    @Test
    public void testDeleteStudent() {
        System.out.println("main");
        String input = "1\n";
        Scanner scanner = new Scanner(input);
        Main.scanner = scanner;
        String result = Main.deleteStudent();
        System.out.println("Actual Result: " + result);
        if (result.contains("Student deleted")) {
            System.out.println("Test passed: Student deleted successfully.");
        } else if (result.contains("not found")) {
            System.out.println("Test failed: Student not found.");
        } else if (result.contains("Invalid input")) {
            fail("Test failed: Invalid input.");
        } else {
            fail("Test failed: Unexpected result.");
        }
    }

    @Test
    public void testSearchStudent() {
        System.out.println("main");

        String input = "1\n";
        Scanner scanner = new Scanner(input);
        Main.scanner = scanner;
        String result = Main.searchStudent();
        System.out.println("Actual Result: " + result);
        if (result.contains("Student found")) {
            assertTrue(result.contains("Student found"));
            System.out.println("Test passed: Student found successfully.");
        } else if (result.contains("not found")) {
            System.out.println("Test failed: Student not found.");
        } else if (result.contains("Invalid input")) {
            fail("Test failed: Invalid input.");
        } else {
            fail("Test failed: Unexpected result.");

        }
    }

    @Test
    public void testSaveStudent() {
        System.out.println("main");
        String studentId = "1";
        String studentName = "Kim Nod";
        String studentAge = "19";
        String studentEmail = "klm@123.com";
        String studentCourse = "Computer Science";
        String input = studentId + "\n" + studentName + "\n" + studentAge + "\n" + studentEmail + "\n" + studentCourse + "\n";
        Scanner scanner = new Scanner(input);
        Main.scanner = scanner;
        String result = Main.saveStudent();
        System.out.println("Actual Result: " + result);

        if (result.contains("Student saved")) {
            assertTrue(result.contains("Kim Nod"));
            assertTrue(result.contains("Computer Science"));
            System.out.println("Test passed: Student saved successfully.");
        } else if (result.contains("Invalid input")) {
            fail("Test failed: Invalid input detected.");
        } else if (result.contains("Invalid age")) {
            fail("Test failed: Age validation failed.");
        } else {
            fail("Test failed: Unexpected result.");
        }
    }

    @Test
    public void testSearchStudent_StudentNotFound() {
        System.out.println("main");

        String input = "123\n";
        Scanner scanner = new Scanner(input);
        Main.scanner = scanner;

        String result = Main.searchStudent();
        System.out.println("Actual Result: " + result);

        if (result.contains("Student with ID 123 not found")) {
            assertTrue(result.contains("Student with ID 123 not found"));
            System.out.println("Test passed: ");
        } else if (result.contains("Invalid input")) {
            fail("Test failed: Invalid input detected.");
        } else {
            fail("Test failed: Unexpected result.");
        }

    }

    @Test
    public void testDeleteStudent_StudentNotFound() {
        System.out.println("main");

        String input = "123\n";
        Scanner scanner = new Scanner(input);
        Main.scanner = scanner;

        String result = Main.deleteStudent();
        System.out.println("Actual Result: " + result);

        if (result.contains("Student with ID 123 not found")) {
            System.out.println("Test passed: Correctly handled non-existent student.");
        } else if (result.contains("Invalid input")) {
            fail("Test failed: Invalid input detected.");
        } else {
            fail("Test failed: Unexpected result.");
        }

    }

    @Test
    public void testStudentAge_StudentAgeValid() {
        System.out.println("main");

        String input = "1\nKim Nod\n19\nkim.nod@example.com\nComputer Science\n";
        Scanner scanner = new Scanner(input);
        Main.scanner = scanner;

        String result = Main.saveStudent();
        System.out.println("Actual Result: " + result);

        if (result.contains("Student saved")) {
            assertTrue(result.contains("Student saved"));
            System.out.println("Test passed: Student with valid age saved successfully.");
        } else if (result.contains("Invalid input")) {
            fail("Test failed: Invalid input detected.");
        } else {
            fail("Test failed: Unexpected result.");
        }

    }

    @Test
    public void testStudentAge_StudentAgeNotValid() {
        System.out.println("main");

        String input = "1\nKim Nod\n15\nkim.nod@example.com\nComputer Science\n";
        Scanner scanner = new Scanner(input);
        Main.scanner = scanner;

        // Call the saveStudent method
        String result = Main.saveStudent();
        System.out.println("Actual Result: " + result);

        // Check the result
        if (result.contains("Invalid age. Age must be 16 or older.")) {
            assertTrue(result.contains("Invalid age. Age must be 16 or older."));
            System.out.println("Test passed: Age below 16 is correctly detected.");
        } else {
            fail("Test failed: Expected 'Invalid age. Age must be 16 or older.' but got: " + result);
        }

    }

    @Test
    public void testStudentAge_StudentAgeInvalidCharacter() {
        System.out.println("main");

        String input = "1\nKim Nod\nabc\nkim.nodexample.com\nComputer Science\n";
        Scanner scanner = new Scanner(input);
        Main.scanner = scanner;

        String result = Main.saveStudent();
        System.out.println("Actual Result: " + result);

        if (result.contains("Invalid input. Please enter a number for age.")) {
            assertTrue(result.contains("Invalid input. Please enter a number for age."));
            System.out.println("Test passed: Invalid character for age detected.");
        } else {
            fail("Test failed: Expected 'Invalid input. Please enter a number for age.' but got: " + result);
        }

    }

}
