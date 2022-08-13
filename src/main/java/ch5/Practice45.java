package ch5;

import java.util.Scanner;

/**
 * Statistic: compute mean and standard deviation
 */

public class Practice45 {
    public static void main(String[] args) {
        // 1. Get user input for 10 numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        int n = 0;
        double num, nSum = 0, n2Sum = 0;
        while (n < 10) {
            num = Double.parseDouble(input.next());
            nSum += num;
            n2Sum += num * num;
            n++;
        }

        // 2. Compute the mean and standard deviation
        System.out.printf("nSum=%f, n=%d\n", nSum, n);
        double mean = nSum / n;
        double sd = Math.pow((n2Sum - nSum * nSum / n) / (n - 1), 0.5);

        // 3. Display result
        System.out.printf("The means is %.2f\n", mean);
        System.out.printf("The standard deviation is %.5f\n", sd);
    }
}
