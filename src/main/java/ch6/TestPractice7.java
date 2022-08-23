package ch6;

import java.util.Scanner;

public class TestPractice7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double amount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualRate = input.nextDouble();

        double returnAmount = 0.0;
        double monthlyRate = annualRate / 1200;
        System.out.println("Years\t\tFuture Value");
        for (int i = 1; i <= 30; i++) {
            returnAmount = Practice7.futureInvestmentValue(amount, monthlyRate, i);
            System.out.printf("%2d\t\t\t%.2f\n", i, returnAmount);
        }
    }
}
