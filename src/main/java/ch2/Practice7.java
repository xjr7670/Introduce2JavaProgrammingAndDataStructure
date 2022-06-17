package ch2;

/**
 * Compute how many years is it from the given minutes
 *
 */

import java.util.Scanner;


public class Practice7 {
    public static void main(String[] args) {
        // 1. Obtain a number
        System.out.println("Enter the number of minutes: ");
        Scanner input = new Scanner(System.in);
        long minutes = input.nextLong();
        // 2. Convert to year
        long year = minutes / 60 / 24 / 365;
        long days = minutes / 60 / 24 % 365;
        // 3. Show resutl
        System.out.printf("%d minutes is approximately %d years and %d days", minutes, year, days);
    }
}
