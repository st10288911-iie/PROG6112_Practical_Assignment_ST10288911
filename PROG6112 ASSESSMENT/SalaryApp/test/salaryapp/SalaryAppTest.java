/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package salaryapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KimKg
 */
public class SalaryAppTest {
    
    public SalaryAppTest() {
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
        
    }
    
    @Test
    public void testCalculateWeeklySalary() {
        Worker worker = new Worker("Kim Kga", 30.0, 40.0);
        double expectedWeeklySalary = 30.0 * 40.0; // 2000.0
        double actualWeeklySalary = worker.calculateWeeklySalary();
        //assertEquals(expectedWeeklySalary, actualWeeklySalary, 0.01, "Weekly salary calculation is incorrect.");
    }
    
    @Test
    public void testCalculateMonthlySalary() {
        Worker worker = new Worker("Tali Money", 50.0, 37.0);
        double weeklySalary = 50.0 * 37.0; // 2100.0
        double expectedMonthlySalary = weeklySalary * 4; // 8400.0
        double actualMonthlySalary = worker.calculateMonthlySalary();
        //assertEquals(expectedMonthlySalary, actualMonthlySalary, 0.01, "Monthly salary calculation is incorrect.");
    }

    @Test
    public void testGetters() {
        Worker worker = new Worker("Lesego Motla", 60.0, 25.0);
        assertEquals("Lesego Motla", worker.getName(), "Name getter is incorrect.");
       // assertEquals(70.0, worker.getHourlyWage(), 0.01, "Hourly wage getter is incorrect.");
        //assertEquals(30.0, worker.getHoursWorked(), 0.01, "Hours worked getter is incorrect.");
    }
}
    

