/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gadin_week_1point2;

/**
 *
 * @author LYNN
 */
public class Gadin_Week_1point2 {

    public static void main(String[] args) {
     double centi = 178.81;
     int wmeters = (int)(centi/100);
     double remaincm = centi -(wmeters * 100);
     
        System.out.println("Converter Centimeters to Meters");
        System.out.println("Total Centimeters "     + centi );
        System.out.println("Result "+ wmeters+"m and " + remaincm+"cm");
     
       int iniInt= 150;
       double widedouble = iniInt;
        System.out.println("\n Implicit Widening ");
        System.out.println("Orignal in int value " + iniInt);
        System.out.println("Widened double value  " + widedouble );
        
        
        double inidouble = 123.456;
        int narrowdouble= (int)inidouble; 
        /* We nee to use cast because in java wont throw away data.
        java check what variables types did you use during compile time
        we just tell the computer that it's okay for the data to be lost */
        double datalost = inidouble - narrowdouble; 
            /*I still use a double for this variable so we can account for the data lost.
             Since we narrow a double into an int, we need to keep the decimal places
             to store the data lost in the process of converting double -> int.
            For example, with the value 123.456, the 123 remains in the int,
            and the data lost is .456, which is the decimal part.*/
        
        System.out.println("\nExplicit narrowing");
        System.out.println("Original value from double "+ inidouble);
        System.out.println("Narrowed int value "+ narrowdouble);
        System.out.println("data lost "+ datalost);
        
        
        
                
    
    
    
    
    }
}