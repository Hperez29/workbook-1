package com.pluralsight;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /// ////
        Scanner input = new Scanner(System.in);

        // Prompt user for their name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Prompt user for hours worked
        System.out.print("Enter hours worked: ");
        double hoursWorked = input.nextDouble();

        // Prompt user for pay rate
        System.out.print("Enter pay rate: ");
        double payRate = input.nextDouble();

        // Calculate gross pay
        double grossPay = hoursWorked * payRate;

        if (hoursWorked <= 40){
            double OTP = payRate * 1.5;
            double OTHour = (hoursWorked - 40) * OTP;
            // and the amount of pay
        }

        // Display the result
        System.out.printf("Employee Name: %s%n", name);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);


    }
    }
