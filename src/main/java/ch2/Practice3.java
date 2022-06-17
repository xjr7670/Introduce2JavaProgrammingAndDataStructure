package ch2;

import java.util.Scanner;

/**
 * Translate the feet to meter.
 */

public class Practice3 {
    public static void main(String[] args) {
        // 1. Get the input of the feet
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
        double feet = input.nextDouble();
        // 2. Translate the feet to meter.
        double meters = feet * 0.305;
        System.out.printf("%f feet is %f meters", feet, meters);
    }
}
