/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask9;
import javax.swing.JOptionPane; /* Or import javax.swing.*;

/**
 *
 * @author RC_Student_lab
 */
public class ICETASK9 {

    public static void main(String[] args) {
        
        //Created an instance of a class
        Calculations Calculations = new Calculations();
        
        //Declarations
        boolean running =true;
        String value1;
        String value2;
        int option = 0;
        
        
        //Prompt user for 2 numbers
        value1 = JOptionPane.showInputDialog("Enter the first number:");
        double number1 =Double.parseDouble(value1); 
        
        value2 = JOptionPane.showInputDialog("Enter the second number:");
        double number2 =Double.parseDouble(value2);
        
        while( running){
        String menu = "Select an operation option to perform:\n"
                        + "1. Addition\n"
                        + "2. Subtraction\n"
                        + "3. Division\n"
                        + "4. Multiplication\n"
                        + "0. Exit";
        String inputOption = JOptionPane.showInputDialog(menu);
        option = Integer.parseInt(inputOption);
        
        double result = 0;
  
            switch (option) {
                case 1:
                    JOptionPane.showMessageDialog(null, Calculations.addition(result, number1, number2));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,Calculations.subtraction(result, number1, number2));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,Calculations.division(result, number1, number2));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,Calculations.multiplication(result, number1, number2));
                    break;
                case 0:
                    running = false;
                    JOptionPane.showMessageDialog(null, "Exiting application.");
                    break;
                default: 
                    JOptionPane.showMessageDialog(null,"Option not recognized");
                }
            }
        }
    }

