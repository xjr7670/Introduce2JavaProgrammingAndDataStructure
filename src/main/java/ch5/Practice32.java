package ch5;

import java.util.Scanner;

/**
 * Game: lottery
 */

public class Practice32 {
    public static void main(String[] args) {
        // 1. Generate two digit's number
        int lotteryDigit1 = (int)(Math.random() * 9), lotteryDigit2;

        while (true) {
            lotteryDigit2 = (int)(Math.random() * 9);
            if (lotteryDigit2 != lotteryDigit1) {
                break;
            }
        }

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (tow digits): ");

        int guess = input.nextInt();

        // Get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.printf("The lottery number is %d%d\n", lotteryDigit1, lotteryDigit2);

        // Check the guess
        if (guess == (lotteryDigit1 * 10 + lotteryDigit2)) {
            System.out.println("Exact match: you win $10.000");
        } else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
            System.out.println("Match all digits: you win $3,000");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
