/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_control_flow_i_4;

/**
 *
 * @author LYNN
 */

import java.util.Scanner;
public class JAVA_CONTROL_FLOW_I_4 {
// control flow 1 using if-else statement 
    public static void main(String[] args) {
            
         Scanner sc = new Scanner(System.in);
 
        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.print("PIN: ");
        String pin = sc.nextLine();
        System.out.print("Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw amount: ");
        double amount = sc.nextDouble();
 
        // 1. Nested if: username AND 4-digit PIN
        if (username.equals("gadin")) {
            if (pin.length() == 4) {
                if (pin.equals("3456")) {
 
                    // 2. Else-if ladder: tier from balance
                    String tier;
                    if (balance >= 20000) {
                        tier = "Platinum";
                    } else if (balance >= 5000) {
                        tier = "Gold";
                    } else if (balance >= 1000) {
                        tier = "Silver";
                    } else {
                        tier = "Bronze";
                    }
 
                    // 3. Switch: fee % and daily limit by tier
                    double feePercent;
                    double dailyLimit;
                    switch (tier) {
                        case "Platinum":
                            feePercent = 0;
                            dailyLimit = 10000;
                            break;
                        case "Gold":
                            feePercent = 0.5;
                            dailyLimit = 5000;
                            break;
                        case "Silver":
                            feePercent = 1;
                            dailyLimit = 1500;
                            break;
                        default:
                            feePercent = 2;
                            dailyLimit = 500;
                    }
 
                    double fee = amount * feePercent / 100;
                    System.out.println("Tier: " + tier + ", Fee: " + fee);
 
                    // 4. Nested if: balance AND daily limit
                    if (amount + fee <= balance) {
                        if (amount <= dailyLimit) {
                            System.out.println("APPROVED. New balance: " + (balance - amount - fee));
                        } else {
                            System.out.println("DENIED: Over the " + tier + " daily limit of " + dailyLimit);
                        }
                    } else {
                        System.out.println("DENIED: Insufficient balance");
                    }
 
                } else {
                    System.out.println("DENIED: Wrong PIN");
                }
            } else {
                System.out.println("DENIED: PIN must be 4 digits");
            }
        } else {
            System.out.println("DENIED: Unknown username");
        }
    }}