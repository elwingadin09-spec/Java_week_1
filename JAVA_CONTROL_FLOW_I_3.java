/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_control_flow_i_3;

/**
 *
 * @author LYNN
 */
public class JAVA_CONTROL_FLOW_I_3 {

    public static void main(String[] args) {
   
String user = "gadin"; //req pass and user correct to login. 
//String pass = "123"; // the correct pass in the boolean val 
//String user = "asd";  // if user is wrong both user/pass = wrong creds
String pass = "1234"; // if pass is wrong both user/pass = wrong creds
boolean islocked = false;

if (user.equals("gadin")) { // the correct boolean value 
    if (pass.equals("123")) { //this also should be correct
        if (!islocked) {
            System.out.println("Login Successful!");

        } else {
            System.out.println("Account is locked.");
        }
    } else {
        System.out.println("Wrong Credentials."); 
    }
} else {
    System.out.println("Wrong Credentials.");
}
    }
}
        
    


      
      
    


