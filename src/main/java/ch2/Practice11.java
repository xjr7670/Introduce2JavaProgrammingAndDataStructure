package ch2;

import java.util.Scanner;

/**
 * Estimate the population
 */

public class Practice11 {
    public static void main(String[] args) {
        // 1. Compute the base number and the increase number of each year.
        final long base = 312032486L;
        long roy = 365 * 24 * 3600 / 7 - 365 * 24 * 3600 / 13 + 365 * 24 * 3600 / 45;
        // 2. Get the number of input year.
        System.out.print("Enter the number of years: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        // 3. Compute the estimate population after the number of year enter by user
        long finalPopulation = base + roy * year;
        System.out.printf("The population in %d years is %d", year, finalPopulation);
    }
}
