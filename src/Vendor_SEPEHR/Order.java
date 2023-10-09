/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vendor_SEPEHR;

import java.util.Scanner;

/**
 *
 * @author sepehrjokanian
 */
public class Order {
    public void order(){
        System.out.println("Please Enter Number Ithem");
        Scanner sc=new Scanner(System.in);
        int ord=sc.nextInt();
        System.out.println("You ordered ithem  " + ord);
        
    }
    
}
