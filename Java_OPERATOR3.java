/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_operator3;



/**
 *
 * @author LYNN
 */


public class Java_OPERATOR3 {

    public static void main(String[] args) {
     
        double intibai = 2000.00;
        
        System.out.println(intibai);
      
            intibai += 500;
       
        System.out.println("\nafter adding 500: " + intibai);      
      
            intibai *= 1.05;
            
        System.out.println("\nafter 5% interest: "+ intibai);
        
         
        int count = 5;
        
        System.out.println(count++);
        System.out.println(count);
            /*
           In this part, the system prints the old value first,
           which is 5, then increases count by 1.
           The next println prints the updated value, which is 6.
            */
        System.out.println("---------------------------");
        
        count = 5;

        System.out.println(++count);
        System.out.println(count);
        
         /*
             In this part, the system increases count by 1 first,
             then prints the updated value, which is 6.
             The next println also prints 6 because count is already 6.
        */
        
        
        
        
      }
}
