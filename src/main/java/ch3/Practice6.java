package ch3;

import java.util.Scanner;

/**
 * BMI calculator
 */

public class Practice6 {
    public static void main(String[] args) {
        // 1. Obtain user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        float weight = input.nextFloat();
        System.out.print("Enter feet: ");
        float feet = input.nextFloat();
        System.out.print("Enter inches: ");
        float inches = input.nextFloat();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_FEET = 0.3048;

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = (inches / 12 + feet) * METERS_PER_FEET;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display result
        System.out.println("BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
