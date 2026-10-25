/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_control_flow_i_2;

/**
 *
 * @author LYNN
 */
public class JAVA_CONTROL_FLOW_I_2 {

    public static void main(String[] args) {
       
        double pa; // purchase amount
        double dr; // discount rate
        double dp; // discounted price

        pa = 5000;

        if (pa >= 5000) {
            dr = 0.15;
        } else if (pa >= 4000) {
            dr = 0.10;
        } else if (pa >= 3000) {
            dr = 0.05;
        } else {
            dr = 0.00;
        }

        dp = pa - (pa * dr);

        System.out.printf("Purchase Amount: %.2f%n", pa);
        System.out.printf("Discount Tier: %.0f%%%n", dr * 100);
        System.out.printf("Discounted Price: %.2f%n", dp);
    }
}

        
        
    

