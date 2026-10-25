/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_operator4;

/**
 *
 * @author LYNN
 */
public class Java_OPERATOR4 {

    public static void main(String[] args) {
         int a = 5, b = 3, c = 2;
               
        // Expression 1
        // Prediction: true
        System.out.println(a + b * c > 10 && a > b);
        // Actual result: true

         int miss = 10, ko = 3, na_sya = 5;
        
            // Expression 2
         // Prediction: false
        System.out.println(miss - ko < na_sya || ko * na_sya == 5);
        // Actual result: false
        // Missed rule: Arithmetic operators execute before relational operators,
        // and relational operators execute before logical OR (||).
        
        // Expression 3
        int y = 9;
        // Prediction: true
        System.out.println(++y * 2 >= 20 && y-- > 4);
        // Actual result: true
        
        
    }
}
