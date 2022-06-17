package ch3;

import java.util.Scanner;

/**
 * 整钱兑零
 */

public class Practice7 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of");
        if (numberOfOneDollars > 0) {
            if (numberOfOneDollars == 1) {
                System.out.println(" " + numberOfOneDollars + " dollar");
            } else {
                System.out.println(" " + numberOfOneDollars + " dollars");
            }
        }
        if (numberOfQuarters > 0) {
            if (numberOfQuarters == 1) {
                System.out.println(" " + numberOfQuarters + " quarter");
            } else {
                System.out.println(" " + numberOfQuarters + " quarters");
            }
        }
        if (numberOfDimes > 0) {
            if (numberOfDimes == 1) {
                System.out.println(" " + numberOfDimes + " quarter");
            } else {
                System.out.println(" " + numberOfDimes + " quarters");
            }
        }
        if (numberOfNickels > 0) {
            if (numberOfNickels == 1) {
                System.out.println(" " + numberOfNickels + " nickel");
            } else {
                System.out.println(" " + numberOfNickels + " nickels");
            }
        }
        if (numberOfPennies > 0) {
            if (numberOfPennies == 1) {
                System.out.println(" " + numberOfPennies + " penny");
            } else {
                System.out.println(" " + numberOfPennies + " pennies");
            }
        }

    }
}
