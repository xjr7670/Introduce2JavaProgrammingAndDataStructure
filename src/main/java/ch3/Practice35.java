package ch3;

import java.util.Scanner;

/**
 * Odd or even
 *
 * Question:
 *  Write a program that prompts the user to enter an integer and
 *  displays whether the integer is an odd number or not. Here are the sample runs:
 *      Enter an integer: 200
 *      200 is even number
 *      Enter an integer: 211
 *      211 is odd number
 */

public class Practice35 {
    public static void main(String[] args) {
        // 1. Obtain user's input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        // 2. Check and display result
        if (number % 2 == 0) {
            System.out.printf("%d is even number", number);
        } else {
            System.out.printf("%d is odd number", number);
        }
    }
}
