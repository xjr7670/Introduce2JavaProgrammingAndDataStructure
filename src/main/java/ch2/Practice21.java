package ch2;

import java.util.Scanner;

/**
 * Compute the rate of investment
 */

public class Practice21 {
    public static void main(String[] args) {
        // 1. Obtain the investment, annual interest rate, and the number of years
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount:");
        float investment = input.nextFloat();
        System.out.println("Enter annual interest rate in percentage: ");
        float rate = input.nextFloat();
        System.out.println("Enter number of years: ");
        int year = input.nextInt();

        // 2. Compute the roi
        double futureValue = investment * Math.pow(1 + rate / 100 / 12, year * 12);

        // 3. Show the result
        System.out.printf("Future value is $%f", futureValue);
    }
}
