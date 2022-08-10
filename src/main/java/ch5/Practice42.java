package ch5;

import java.util.Scanner;

/**
 * Financial application: find the sales amount
 */

public class Practice42 {
    public static void main(String[] args) {
        int base = 5000;
        double salesAmount = 0.0;
        double bound1 = 5000 * 0.06;
        double bound2 = 5000 * 0.08;

        System.out.print("Enter your target: ");
        Scanner input = new Scanner(System.in);
        double totalEarn = input.nextDouble();
        double target = totalEarn - base;
        double commission = 0.0;
        if (target <= bound1) {
            salesAmount = 5000 / 0.06;
        } else if (target > bound1 && target <= (bound1 + bound2)) {
            salesAmount = (target - bound1) / 0.08;
        } else {
            salesAmount = 10000;
            while (commission < target) {
                ++salesAmount;
                commission = (salesAmount - 10000) * 0.10 + (bound1 + bound2);
            }
        }

        System.out.printf("In order to earn $%.2f a year, you need to sale %.2f at least\n", totalEarn, salesAmount);
    }
}
