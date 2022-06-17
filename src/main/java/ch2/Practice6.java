package ch2;

import java.util.Scanner;

/**
 * Get the sum for each digit's sum of a number
 */

public class Practice6 {
    public static void main(String[] args) {
        // 1. Obtain a number
        System.out.println("Enter a number between 0 and 1000: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        // 2. Compute the sum
        int digits = num % 10;
        int tens = num / 10 % 10;
        int hundred = num / 100;
        // 3. Show the result
        System.out.printf("The sum of the digits is %d", digits + tens + hundred);
    }
}
