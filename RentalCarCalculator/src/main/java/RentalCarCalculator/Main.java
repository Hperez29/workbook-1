package RentalCarCalculator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double BASIC_RENTAL_PER_DAY = 29.99;
        final double TOLL_TAG_COST_PER_DAY = 3.95;
        final double GPS_COST_PER_DAY = 2.95;
        final double ROADSIDE_ASSISTANCE_COST_PER_DAY = 3.95;
        final double UNDERAGE_SURCHARGE_RATE = 0.30;

        // User input
        System.out.print("Enter pickup date (): ");
        String pickupDate = scanner.nextLine();

        System.out.print("Enter number of rental days: ");
        int rentalDays = Integer.parseInt(scanner.nextLine());

        System.out.print("Do you want an electronic toll tag? (yes/no): ");
        String tollTagInput = scanner.nextLine().toLowerCase();

        System.out.print("Do you want a GPS? (yes/no): ");
        String gpsInput = scanner.nextLine().toLowerCase();

        System.out.print("Do you want roadside assistance? (yes/no): ");
        String roadsideInput = scanner.nextLine().toLowerCase();

        System.out.print("Enter your current age: ");
        int age = Integer.parseInt(scanner.nextLine());

        // Cost calculation using if and switch
        double basicRentalCost = BASIC_RENTAL_PER_DAY * rentalDays;
        double optionsCost = 0.0;

        // Use switch for toll tag
        switch (tollTagInput) {
            case "yes":
                optionsCost += TOLL_TAG_COST_PER_DAY * rentalDays;
                break;
            case "no":
                break;
            default:
                System.out.println("Invalid input for toll tag. Assuming no.");
        }

        // Use if for GPS
        if (gpsInput.equals("yes")) {
            optionsCost += GPS_COST_PER_DAY * rentalDays;
        }

        // Use if for roadside assistance
        if (roadsideInput.equals("yes")) {
            optionsCost += ROADSIDE_ASSISTANCE_COST_PER_DAY * rentalDays;
        }

        // Use if for underage surcharge
        double underageSurcharge = 0.0;
        if (age < 25) {
            underageSurcharge = basicRentalCost * UNDERAGE_SURCHARGE_RATE;
        }

        double totalCost = basicRentalCost + optionsCost + underageSurcharge;

        // Output
        System.out.println("\n--- Rental Car Cost Estimate ---");
        System.out.println("Pickup Date: " + pickupDate);
        System.out.printf("Basic Rental (%d days @ $%.2f/day): $%.2f\n", rentalDays, BASIC_RENTAL_PER_DAY, basicRentalCost);
        System.out.printf("Options Cost: $%.2f\n", optionsCost);
        System.out.printf("Underage Driver Surcharge: $%.2f\n", underageSurcharge);
        System.out.printf("Total Estimated Cost: $%.2f\n", totalCost);

        scanner.close();
    }
}