/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_week_5_arrays_1;

/**
 *
 * @author LYNN
 */
public class JAVA_WEEK_5_ARRAYS_1 {

    public static void main(String[] args) {
        String[] favs = {"Gym", "Cellphone","Computer","Wifi","Pera" };
        
        System.out.println("Mga Favorite ko;");
        
        for (int i = 0; 0< favs.length; i++){
          System.out.println((i + 1) + ". " + favs[i]);
        }
        
        System.out.println("Total of fav things:" + favs.length);
    }
}
