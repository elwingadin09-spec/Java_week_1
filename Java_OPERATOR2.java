/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_operator2;

/**
 *
 * @author LYNN
 */
import java.util.Scanner;
public class Java_OPERATOR2 {

    public static void main(String[] args) {
         Scanner enter = new Scanner(System.in);
         System.out.println("\t\t\tGrade  Threshold Checker");
         
        System.out.println("Enter your grades: ");
        double ave = enter.nextDouble();
        
        System.out.println("Enter Number of Absences:");
        int abs = enter.nextInt();
   
        
        boolean passed = (ave >= 75 && abs <= 3)|| (ave >= 90);
        
        if (passed) {
            System.out.println("Result: PASS");
            System.out.println("You meet the passing requirements.");
        } else {
            System.out.println("Result: FAIL");
            System.out.println("You do not meet the passing requirements.");
        }
        
        
        
        
         
         
        
        
             }
}
