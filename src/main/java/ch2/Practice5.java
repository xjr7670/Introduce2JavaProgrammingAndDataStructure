package ch2;

/**
 * Financial application
 */

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        // 1. Obtain the subtotal and the gratuity rate
        System.out.println("Enter the subtotal and a gratuity rate:");
        Scanner input = new Scanner(System.in);
        double subtotal = input.nextDouble();
        double rate = input.nextDouble();
        // 2. Compute the gratuity and the total fee
        double gratuity = subtotal * (rate / 100);
        double total = subtotal + gratuity;
        // 3. Show the result
        System.out.printf("The gratuity is $%.3f and total is %.3f", gratuity, total);
    }
}
