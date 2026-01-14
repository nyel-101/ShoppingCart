/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shoppingcart;

/**
 *
 * @author Nullroot 13
 */

// shopping cart program
import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("what item would you like to buy?:   ");
        item = scanner.nextLine();

        System.out.println("what is the price for each?:    ");
        price = scanner.nextDouble();

        System.out.println("How many you like ?:   ");
        quantity = scanner.nextInt();

        total = price * quantity;
        
        System.out.println(total);

        System.out.println("===================================================\n");

        System.out.println("\n You have Bought " + quantity + " " + item + "\n");

        System.out.println("===================================================\n");

        scanner.close();

    }
}
