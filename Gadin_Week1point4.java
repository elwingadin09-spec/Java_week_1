/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gadin_week1point4;

/**
 *
 * @author LYNN
 */
public class Gadin_Week1point4 {

    public static void main(String[] args) {
        
        byte num = 127; 
       
       
        System.out.println("Byte Overflow ");
        System.out.println("Before Increment : "+ num);
        
        num++;
        
        System.out.println("After Increment " + num);
        
        
        String a = new String("Konichiwa");
        String b =  new String("Konichiwa");
        String c = "Konichiwa";
       
        System.out.println("a == b " + (a == b)); 
        
        System.out.println("a == c: " + (a == c));
       /* '==' Compares the references, it "ask the the two variable pointing
        to the exact same object new String allows the a and b contain two
        object." and the  .equals() "ask the if the text inside is the same".
        */

        System.out.println("a.equals(c): " + a.equals(c));
       

        System.out.println("b == c: " + (b == c));
       

        System.out.println("b.equals(c): " + b.equals(c));
        
        int [] no = {1,2,3};
        int [] yes = no; // similar array so they will print the same output
        
        yes[0] = 10;
        // It declare array to start 10 so the array is  {0,1,2} = {10,2,3}
        
        System.out.println("no[0]" + no[0]);
        System.out.println("yes [0] " + yes [0]);
        System.out.println("no [1]" + no[1]);
        System.out.println("yes [2]" + yes[2]);
        

       
        
        
        
    }
}
