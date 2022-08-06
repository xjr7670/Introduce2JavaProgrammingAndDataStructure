package ch5;

import java.util.Scanner;

/**
 * Financial application: compound value
 */

public class Practice30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter the months: ");
        int months = input.nextInt();

        double sum = 0.0;
        double monthlyRate = rate / 100 / 12;
        for (int i = 1; i <= months; i++) {
            sum = (amount + sum) * (1 + monthlyRate);
        }
        System.out.printf("After %d months, your amount will change to %.3f\n", months, sum);
    }
}
