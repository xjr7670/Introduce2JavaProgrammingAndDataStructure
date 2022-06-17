package ch3;

import java.util.Scanner;

/**
 * Three number palindrome
 */

public class Practice12 {
    public static void main(String[] args) {
        // 1. obtain a three digits number
        System.out.println("Enter a three-digit integer: ");
        Scanner input = new Scanner(System.in);
        int srcNumber = input.nextInt();
        int number = srcNumber;

        // 2. Determine if this number is a palindrome
        if (number < 0) {
            number = -1 * number;
        }

        int digit, hun;
        digit = number % 10;
        hun = number / 100;

        // 3. Display result
        if (hun == digit) {
            System.out.printf("%d is a palindrome\n", srcNumber);
        } else {
            System.out.printf("%d is not a palindrome\n", srcNumber);
        }
    }
}
