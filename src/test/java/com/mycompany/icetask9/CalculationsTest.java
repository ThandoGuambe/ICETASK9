/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.icetask9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class CalculationsTest {
    
  

    /**
     * Test of addition method, of class Calculations.
     */
    
    //Testing addition method
    @Test
    public void testAddition() {
        System.out.println("addition");
        double result_2 = 15.0;
        double number1 = 10.0;
        double number2 = 5.0;
        Calculations instance = new Calculations();
        double expResult = 15.0;
        double result = instance.addition(result_2, number1, number2);
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of subtraction method, of class Calculations.
     */
    //Testing subtraction method
    @Test
    public void testSubtraction() {
        System.out.println("subtraction");
        double result_2 = 5.0;
        double number1 = 10.0;
        double number2 = 5.0;
        Calculations instance = new Calculations();
        double expResult = 5.0;
        double result = instance.subtraction(result_2, number1, number2);
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of division method, of class Calculations.
     */
    //Testing division method
    @Test
    public void testDivision() {
        System.out.println("division");
        double result_2 = 2.0;
        double number1 = 10.0;
        double number2 = 5.0;
        Calculations instance = new Calculations();
        double expResult = 2.0;
        double result = instance.division(result_2, number1, number2);
        assertEquals(expResult, result, 0);
       
    }

    /**
     * Test of multiplication method, of class Calculations.
     */
    //Testing multiplication method
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        double result_2 = 50.0;
        double number1 = 10.0;
        double number2 = 5.0;
        Calculations instance = new Calculations();
        double expResult = 50.0;
        double result = instance.multiplication(result_2, number1, number2);
        assertEquals(expResult, result, 0);
 
    }
    
}
