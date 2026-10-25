/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_control_flow_ii_3;

/**
 *
 * @author LYNN
 */
public class JAVA_CONTROL_FLOW_II_3 {

    public static void main(String[] args) {
        
        for (int e = 1; e <= 10; e++) {
 
            // CONTINUE: skip row 4 completely (nothing is printed for it)
            if (e == 4) {
                continue;
            }
 
            // Square: every row prints up to 10 columns
            for (int b = 1; b <= 5; b++) {
 
                // BREAK: stop the INNER loop early once column 8 is reached
                if (b == 5) {
                    break;
                }
 
                System.out.print("* ");   // print (not println) keeps stars on the same line
            }
            System.out.println();        //
    }
}
}
