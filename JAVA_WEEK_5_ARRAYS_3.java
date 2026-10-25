/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_week_5_arrays_3;

/**
 *
 * @author LYNN
 */
import java.util.Arrays;
public class JAVA_WEEK_5_ARRAYS_3 {

    public static void main(String[] args) {
       int[] scores = {10, 15, 33, 45, 50, 48, 15, 16};
 
        int sum = 0;
        int high = scores[0];
        int low = scores[0];
 
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
 
            if (scores[i] > high) {
                high = scores[i];
            }
            if (scores[i] < low) {
                low = scores[i];
            }
        }
 
        double average = (double) sum / scores.length;
 
        System.out.println("Number of scores: " + scores.length);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest score: " + high);
        System.out.println("Lowest score: " + low);

        int target = 33;
        int foundIndex = -1;  
 
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundIndex = i;
                break;         
            }
        }
 
        if (foundIndex != -1) {
            System.out.println("Target " + target + " found at index " + foundIndex);
        } else {
            System.out.println("Target " + target + " was not found");
        }
 
   
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);
 
        System.out.println("Original: " + Arrays.toString(scores));
        System.out.println("Sorted:   " + Arrays.toString(sortedScores));
    }
}
 
        
        
        
        
        
        
        
  
