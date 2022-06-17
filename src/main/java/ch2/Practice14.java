package ch2;

import java.util.Scanner;

/**
 * Compute the BMI
 */

public class Practice14 {
    public static void main(String[] args) {
        // 1. Obtain the weight in pounds, and the height in the inches
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight in pounds: ");
        float weight = input.nextFloat();
        System.out.println("Enter height in inchhes: ");
        float height = input.nextFloat();
        // 2. Compute the bmi
        double bmi = (weight * 0.45359237) / Math.pow((height * 0.0254), 2);
        // 3. Show the result
        System.out.printf("BMI is %.4f", bmi);
    }
}
