/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_control_flow_ii_2;

/**
 *
 * @author LYNN
 */
import java.util.Scanner;
public class JAVA_CONTROL_FLOW_II_2 {

    public static void main(String[] args) {
       Scanner iskan= new Scanner(System.in);
       
       int tot = 0; 
        System.out.println("Enter a number (-1 to stop ): ");
        int val = iskan.nextInt();
        
        while (val != -1){
        tot += val;
            System.out.println("Enter a number (-1 to stop ");
            val =  iskan.nextInt();
        }
        System.out.println("Total: " + tot);
     
    } 
    }

