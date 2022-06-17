package ch2;

import java.util.Scanner;

/**
 * Convert pound to kilogram
 */

public class Practice4 {
    public static void main(String[] args) {
        // 1. Obtain the pounds
        System.out.println("Enter a number in pounds:");
        Scanner input = new Scanner(System.in);
        double pounds = input.nextDouble();
        // 2. Convert to kilogram
        double kg = pounds * 0.454;
        // 3. Show the result
        System.out.printf("%.3f pounds is %.3f kilograms", pounds, kg);
    }
}
