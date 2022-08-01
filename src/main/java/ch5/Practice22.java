package ch5;

import java.util.Scanner;

/**
 * Financial application: loan amortization schedule - 贷款摊销时间表
 */

public class Practice22 {
    public static void main(String[] args) {
        // 1. Get user's input
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        // 2. Compute the monthly payment and total payment
        double monthlyRate = annualInterestRate / 1200;
        double monthlyPayment = (loanAmount * monthlyRate) / (1 - (1 / Math.pow((1 + monthlyRate), years * 12)));
        double totalPayment = monthlyPayment * 12;

        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n", totalPayment);

        // 3. Display result
        // print table head
        System.out.printf("%8s\t%8s\t%10s\t%10s\n", "Payment#", "Interest", "Principal", "Balance");
        double interest, principal, balance = loanAmount;
        for (int i = 1; i <= years * 12; i++) {
            interest = monthlyRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%8d\t%8.2f\t%10.2f\t%10.2f\n", i, interest, principal, balance);
        }
    }
}
