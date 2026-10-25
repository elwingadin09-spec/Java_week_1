/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_control_flow_ii_4;

import java.util.Scanner;

/**
 *
 * @author LYNN
 */

public class JAVA_CONTROL_FLOW_II_4 {

    static final int DAMAGED = -1;
    static final int CRITICAL_THRESHOLD = 31; 
 
    static int[][] warehouse = {
        { 12,  8, -1, 25 },
        {  3, 40, 15, -1 },
        { 20,  0,  9, 14 }
    };
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
 
     
        do {
            printMenu();
            choice = readInt(in, "Choose an option: ");
 
            switch (choice) {
                case 1 -> displayWarehouse();
                case 2 -> System.out.println("Total inventory (damaged shelves excluded): "
                            + totalInventory());
                case 3 -> findFirstCriticalShelf();
                case 4 -> restock(in);
                case 5 -> System.out.println("Exiting scanner. Goodbye!");
                default -> System.out.println("Invalid option. Please choose 1-5.");
            }
        } while (choice != 5);
 
        in.close();
    }
 
    static void printMenu() {
        System.out.println("\n      WAREHOUSE INVENTORY SCANNER     ");
        System.out.println("1. Display warehouse");
        System.out.println("2. Total inventory");
        System.out.println("3. Find first critically low shelf");
        System.out.println("4. Restock a shelf");
        System.out.println("5. Exit");
    }
 
    static void displayWarehouse() {
        System.out.println("\nWarehouse layout (X = damaged):");
        for (int r = 0; r < warehouse.length; r++) {
            System.out.print("Row " + r + ": ");
            for (int c = 0; c < warehouse[r].length; c++) {
                String cell = (warehouse[r][c] == DAMAGED) ? "X" : String.valueOf(warehouse[r][c]);
                System.out.printf("%4s", cell);
            }
            System.out.println();
        }
    }
 
  
    static int totalInventory() {
        int total = 0;
        for (int[] warehouse1 : warehouse) {
            for (int c = 0; c < warehouse1.length; c++) {
                if (warehouse1[c] == DAMAGED) {
                    continue;               // damaged shelf: don't count it
                }
                total += warehouse1[c];
            }
        }
        return total;
    }
 
    // nested loops + break: stop both loops at the first critically low shelf
    static void findFirstCriticalShelf() {
        int foundRow = -1, foundCol = -1;
 
        for (int r = 0; r < warehouse.length; r++) {
            for (int c = 0; c < warehouse[r].length; c++) {
                int count = warehouse[r][c];
                if (count != DAMAGED && count < CRITICAL_THRESHOLD) {
                    foundRow = r;
                    foundCol = c;
                    break;                  // leave the inner loop
                }
            }
            if (foundRow != -1) {
                break;                      // leave the outer loop
            }
        }
 
        if (foundRow == -1) {
            System.out.println("No critically low shelves (threshold: under "
                    + CRITICAL_THRESHOLD + " items).");
        } else {
            System.out.println("First critically low shelf: Row " + foundRow
                    + ", Col " + foundCol + " (" + warehouse[foundRow][foundCol] + " items)");
        }
    }
 
    
    static void restock(Scanner in) {
        int row = -1, col = -1;
 

        while (row < 0 || row >= warehouse.length) {
            row = readInt(in, "Row (0-" + (warehouse.length - 1) + "): ");
            if (row < 0 || row >= warehouse.length) {
                System.out.println("Invalid row. Try again.");
            }
        }
 
      
        while (col < 0 || col >= warehouse[row].length) {
            col = readInt(in, "Column (0-" + (warehouse[row].length - 1) + "): ");
            if (col < 0 || col >= warehouse[row].length) {
                System.out.println("Invalid column. Try again.");
            }
        }
 
        if (warehouse[row][col] == DAMAGED) {
            System.out.println("Shelf is damaged and cannot be restocked.");
            return;                         // early exit
        }
 
        int qty = 0;
        while (qty <= 0) {
            qty = readInt(in, "Quantity to add (must be positive): ");
            if (qty <= 0) {
                System.out.println("Quantity must be greater than 0.");
            }
        }
 
        warehouse[row][col] += qty;
        System.out.println("Restocked shelf [" + row + "][" + col + "]. New count: "
                + warehouse[row][col]);
    }
 

    static int readInt(Scanner in, String prompt) {
        System.out.print(prompt);
        while (!in.hasNextInt()) {
            System.out.println("Please enter a whole number.");
            in.next();                    
            System.out.print(prompt);
        }
        return in.nextInt();
    }
}