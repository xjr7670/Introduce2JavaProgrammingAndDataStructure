package ch2;

import java.util.Scanner;

/**
 * Compute the interest
 */

public class Practice20 {
    public static void main(String[] args) {
        // 1. Obtain the balance and interest
        System.out.println("Enter balance and interest rate (e.g., 3 for 3%: ");
        Scanner input = new Scanner(System.in);
        float balance = input.nextFloat();
        float interestRate = input.nextFloat();

        // 2. Compute the next month's interest rate
        double interest = balance * (interestRate / 1200);

        // 3. Show the result
        System.out.printf("The interest is %f", interest);
    }
}
