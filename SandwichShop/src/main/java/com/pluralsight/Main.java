package com.pluralsight;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Step 1: Prompt for sandwich size
        System.out.println("Chose your sandwich size:");
        System.out.println("1: Regular - $5.45");
        System.out.println("2: Large - $8.95");
        System.out.println("Enter 1 or 2:");
        int sizeChoice = scanner.nextInt();

        double basePrice;
        if (sizeChoice == 1) {
            basePrice = 5.45;

        } else if (sizeChoice == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Invalid selection. Go back to Regular size.");
            basePrice = 5.45;



        }

        // Step 2:Prompt for age
        System.out.print("Enter your age:");
        int age = scanner.nextInt();

        // Step 3: Calculate discount
        double discount;
        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }else {
            discount = 0.0;
        }

        // Step 4: Calculate final price
        double finalPrice = basePrice * (1 - discount);

        // Step 5: Display the cost
        System.out.printf("The cost of your sandwich is: $%.2f%n", finalPrice);

        scanner.close();

    }
}