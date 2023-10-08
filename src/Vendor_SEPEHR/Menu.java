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
public class Menu {
    public void menu(){
        System.out.println("1-FOOD 2-BEVERAGE 3-SALAD 4-EXIT");
        //get the input
        Scanner sc=new Scanner(System.in);
        int select=sc.nextInt();
        //use switch to show differet menu option
        
        switch(select)
        {
            case 1:
                System.out.println("1-FISH\n 2-KEBAB\n 3-PEAWN\n 4-CHICKEN\n 5-RICE");break;
            case 2:
              System.out.println("1-FANTA\n 2-COKOCOLA\n 3-WATER\n 4-JUICE");break; 
            case 3:
                System.out.println("1-TOSSED SALAD\n 2-CAESAR SALAD\n 3-GREEK SALAD");break;
            case 4:System.exit(0);
            default: 
                System.out.println("Invalid selection");
                System.exit(0);break;
        }
    }
                                           
    
}
