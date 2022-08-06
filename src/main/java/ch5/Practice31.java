package ch5;

import java.util.Scanner;

/**
 * Financial application: compute CD value
 */

public class Practice31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        double deposit = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double percentage = input.nextDouble();
        System.out.print("Enter maturity period (number of months):");
        int period = input.nextInt();

        // 2. Computer the result
        double cdValue = deposit;
        double monthlyRate = percentage / 12 / 100;
        System.out.printf("%5s\t%10s\n", "Month", "CD Value");
        for (int i = 1; i <= period; i++) {
            cdValue = cdValue + cdValue * monthlyRate;
            System.out.printf("%-5d\t%10.2f\n", i, cdValue);
        }

    }
}
