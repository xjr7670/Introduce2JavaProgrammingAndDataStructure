package ch4;

import java.util.Scanner;

/**
 * Financial application: monetary units
 */

public class Practice26 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount in string, for example 11.56: ");
        String amount = input.nextLine();

        int dollarAmount = Integer.parseInt(amount.substring(0, amount.indexOf(".")));
        int cents = Integer.parseInt(amount.substring(amount.indexOf(".")+1, amount.length()));

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = cents / 25;
        int remainingAmount = cents % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display result
        System.out.printf("Your amount %s consists of\n", amount);
        System.out.printf(" %d dollars\n", dollarAmount);
        System.out.printf(" %d quarters\n", numberOfQuarters);
        System.out.printf(" %d dimes\n", numberOfDimes);
        System.out.printf(" %d nickels\n", numberOfNickels);
        System.out.printf(" %d pennies\n", numberOfPennies);
    }
}
