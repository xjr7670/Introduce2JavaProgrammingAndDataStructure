package ch5;

import java.util.Scanner;

/**
 * Financial application: find the sales amount
 */

public class Practice39 {
    public static void main(String[] args) {
        int base = 5000;
        double salesAmount = 0.0;
        double bound1 = 5000 * 0.06;
        double bound2 = 5000 * 0.08 + bound1;

        System.out.print("Enter your target: ");
        Scanner input = new Scanner(System.in);
        double totalEarn = input.nextDouble();
        double target = totalEarn - base;

        if (target <= bound1) {
            salesAmount = target / 0.06;
        } else if (target > bound1 && target <= bound2) {
            salesAmount = (target - bound1) / 0.08 + 5000;
        } else {
            salesAmount = (target - bound2) / 0.10 + 10000;
        }

        System.out.printf("In order to earn $%.2f a year, you need to sale %.2f at least\n", totalEarn, salesAmount);
    }
}
