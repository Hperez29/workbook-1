package com.pluralsight;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //////
        // Exercise 1
        Scanner Math2 = new Scanner(System.in);

        System.out.println("What is the first number?");
        double number1 = Math2.nextInt();


        System.out.println("What is the Second number?");
        double number2 = Math2.nextInt();


        Math2.nextLine();
        System.out.println("What you want it to do");
        System.out.println("Possible calculations: \n"
                + "(A)dd \n"
                + "(S)ubtract \n"
                + "(M)ultiply \n"
                + "(D)ivide \n");
        System.out.print("Please select an option: ");

        String operation = Math2.nextLine();

        double result = number1 * number2;


        System.out.printf("The product of " + number1 + " and " + number2 + " is " + result );


    }




}