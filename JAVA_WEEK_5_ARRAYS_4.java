/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_week_5_arrays_4;

/**
 *
 * @author LYNN
 */


class Student {
    String name;
    int[] quizzes;
    double average;
    int rank;
 
    Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
 
      
        int sum = 0;
        for (int i = 0; i < quizzes.length; i++) {
            sum += quizzes[i];
        }
        this.average = (double) sum / quizzes.length;
    }
}



public class JAVA_WEEK_5_ARRAYS_4 {

    public static void main(String[] args) {
       // Raw data: names, and a 2D array where each row is one student's quizzes
        String[] names = { "Alice", "Bob", "Carla", "Dan", "Ella", "Finn" };
        int[][] quizData = {
            { 90, 85, 92, 88 },   // Alice  -> 88.75
            { 75, 80, 70, 85 },   // Bob    -> 77.5
            { 95, 98, 92, 96 },   // Carla  -> 95.25
            { 80, 85, 90, 85 },   // Dan    -> 85.0 (ties with Ella)
            { 70, 90, 85, 95 },   // Ella   -> 85.0 (ties with Dan)
            { 60, 65, 70, 75 }    // Finn   -> 67.5
        };
 
    
        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], quizData[i]);
        }
 
        sortByAverage(students);   
        assignRanks(students);     
        printLeaderboard(students);
 
    
        System.out.println();
        printSearchResult(students, "Carla");
        printSearchResult(students, "Ella");
        printSearchResult(students, "Zed");
    }
 
    // Two averages count as equal if they differ by almost nothing
    static boolean sameAverage(double a, double b) {
        return Math.abs(a - b) < 0.0001;
    }
 
    static void sortByAverage(Student[] list) {
        for (int pass = 0; pass < list.length - 1; pass++) {
            for (int i = 0; i < list.length - 1 - pass; i++) {
                if (list[i].average < list[i + 1].average
                        && !sameAverage(list[i].average, list[i + 1].average)) {
                    Student temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
    }

    static void assignRanks(Student[] sorted) {
        for (int i = 0; i < sorted.length; i++) {
            if (i > 0 && sameAverage(sorted[i].average, sorted[i - 1].average)) {
                sorted[i].rank = sorted[i - 1].rank;   // tie: same rank
            } else {
                sorted[i].rank = i + 1;
            }
        }
    }
 
    // Our own linear search: returns the student's rank, or -1 if not found
    static int findRank(Student[] sorted, String name) {
        for (int i = 0; i < sorted.length; i++) {
            if (sorted[i].name.equalsIgnoreCase(name)) {
                return sorted[i].rank;
            }
        }
        return -1;
    }
 
    static void printSearchResult(Student[] sorted, String name) {
        int rank = findRank(sorted, name);
        if (rank == -1) {
            System.out.println(name + " was not found.");
        } else {
            System.out.println(name + " is ranked #" + rank);
        }
    }
 
    static void printLeaderboard(Student[] sorted) {
        System.out.println("===== CLASS LEADERBOARD =====");
        System.out.printf("%-6s %-10s %-8s %s%n", "Rank", "Name", "Average", "Note");
        System.out.println("-----------------------------");
 
        for (int i = 0; i < sorted.length; i++) {
            boolean tiedWithPrevious = i > 0 && sorted[i].rank == sorted[i - 1].rank;
            boolean tiedWithNext = i < sorted.length - 1 && sorted[i].rank == sorted[i + 1].rank;
            String note = (tiedWithPrevious || tiedWithNext) ? "tie" : "";
 
            System.out.printf("%-6d %-10s %-8.2f %s%n",
                    sorted[i].rank, sorted[i].name, sorted[i].average, note);
        }
    }
}