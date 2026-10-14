            /*
             * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
             */

            package com.mycompany.gadin_week_2;

            /**
             *
             * @author LYNN
             */
            public class Gadin_Week_2 {

                public static void main(String[] args) {
                   String pesos = "Php";
                   String storename ="Suplement Shop";
                  
                   int qty= 100;
                   int a = 30;
                   int b = 40;
                   int sum1 = a+b;  
                   int total = qty - sum1;

                   double unitA =400.12;
                   double unitB = 300.34;
                                
                   double  totalcrea = a * unitB;
                   double totalwhey = b * unitA;
                   double totalcost = totalcrea + totalwhey;

                    System.out.println("Store name: "+storename);
                    System.out.println("Whey's Price:" + unitB +  pesos );
                    System.out.println("Creatine's Price:" + unitA+  pesos);
                    System.out.println("Stocks each: " + qty);
                    System.out.println("Totaly Quantity left: " + total);
                    
                    System.out.println("________________RESIBO! bayad na po______________");
                    
                    System.out.println("Quantity of crea: "+ unitA);
                    System.out.println("Quantity of whey: "+ unitB);
                    System.out.println("Quantity Purchase: "+ sum1);
                    System.out.println("___________________________________________________");
                    System.out.println("Total Price:" + totalcost + pesos);

                }
            }
                   /*I declared the cost as double 
                   because it can store decimal values.
                   If I use int for the total cost, 
                   it cannot account for decimal values, such as cents,
                   which may affect the calculation. Using double helps
                   preserve decimal values when computing the total cost.
                   Meanwhile, I used int for the quantity because the number 
                   of items is counted in whole numbers. Therefore, double is 
                   more suitable for prices and costs, while int is appropriate
                   for quantities.*/
