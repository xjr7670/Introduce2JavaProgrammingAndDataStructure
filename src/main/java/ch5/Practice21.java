package ch5;

import java.util.Scanner;

/**
 * Financial application: compare loans with various interest rates
 */

public class Practice21 {
    public static void main(String[] args) {
        // 1. Prompt user to enter
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double amount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();

        // 2. print table head
        System.out.printf("%20s\t%20s\t%20s\n", "Interest Rate", "Monthly Payment", "Total Payment");

        // 3. compute the result
        double monthlyPay = 0.0, totalPay = 0.0;
        double monthlyRate = 0.0;
        for (double yearlyRate = 5; yearlyRate <= 10; yearlyRate += 0.25) {
            monthlyRate = yearlyRate / 1200;
            monthlyPay = (amount * monthlyRate) / (1 - (1 / Math.pow((1 + monthlyRate), years * 12)));
            totalPay = monthlyPay * years * 12;
            System.out.printf("%20.3f%%\t%20.2f\t%20.2f\n", yearlyRate, monthlyPay, totalPay);
        }
    }
}
