package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {

        // Question 1:
        //// declare variables here
        //// then code solution
        //// then use System.out.println() to display results
        //// ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        // Question 1:
        System.out.println("Determine whose salary is greater");
        double bobSalary = 70000;
        double garySalary = 85000;

        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The answer is " + highestSalary);

        /// //////////
        // Question 2:
        System.out.println("Find and display the smallest of two variables");
        double carPrice = 22000;
        double truckPrice = 28000;

        double a2 = Math.min(carPrice, truckPrice);

        System.out.println("The answer is " + a2);

        /// ///////////////////
        // Question 3:
        System.out.println("Find and display the area of a circle whose radius is 7.25");
        double circleRadius = 7.25;
        double circleArea = Math.PI * Math.pow(circleRadius, 2);

        System.out.println("The answer is " + circleArea);

        /// ///////////////
        // Question 4:
        System.out.println("Find and display the square root a variable after it is set to 5.0 ");
        double number = 5;
        double squareRoot = Math.sqrt(number);

        System.out.println("The answer is " + squareRoot);


        /// ////////////////
        // Question 5:
        System.out.println("Find and display the distance between the points (5, 10) and (85, 50)");

        double x1 = 5;
        double x2 = 85;
        double y1 = 10;
        double y2 = 50;

        double distance = Math.sqrt((Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2));


        System.out.println("The answer is " + distance);

        /// //////////
        // Question 6:
        System.out.println("Find and display the absolute (positive) value of a variable after it is set to -3.8 ");
        double number2 = -3.8;
        double positive = Math.abs(number2);


        System.out.println("The answer is " + positive);

        /// /////
        // Question 7:
        System.out.println(" Find and display a random number between 0 and 1");
        double randomnumber = Math.random();

        System.out.println("The answer is " + randomnumber);




    }
}


