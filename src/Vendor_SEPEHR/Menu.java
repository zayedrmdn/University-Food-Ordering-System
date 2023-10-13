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
    Scanner sc = new Scanner(System.in);

        
            System.out.println("1-FOOD 2-BEVERAGE 3-SALAD 4-EXIT");
            int select = sc.nextInt();

            switch (select) {
                case 1:
                    System.out.println("1-FISH\n2-KEBAB\n3-PEAWN\n4-CHICKEN\n5-RICE");
                    break;
                case 2:
                    System.out.println("1-FANTA\n2-COCA-COLA\n3-WATER\n4-JUICE");
                    break;
                case 3:
                    System.out.println("1-TOSSED SALAD\n2-CAESAR SALAD\n3-GREEK SALAD");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid selection");
                    break;
            }
       
    }
    public void order(){
      Scanner sc = new Scanner(System.in);

do {
    System.out.println("Please Enter Number Item");
    int ord = sc.nextInt();
    System.out.println("You ordered item " + ord);
    sc.nextLine(); // Consume the newline character

    System.out.println("Press 'C/c' to continue order, 'M/m' to main menu");
    String a = sc.nextLine();

    if ("M".equalsIgnoreCase(a)) {
        Menu s=new Menu();
        s.menu();
         // Exit the loop
    } else if (!"C".equalsIgnoreCase(a)) {
        System.out.println("Invalid Input");
    }
} while (true);

    }
}                                        
    

