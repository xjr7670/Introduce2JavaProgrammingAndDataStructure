package ch2;

import java.util.Scanner;

/**
 * Compute the acceleration
 */

public class Practice9 {
    public static void main(String[] args) {
        // Obtain the start speed v0, stop speed v1, expired time t
        System.out.println("Enter v0, v1 and t: ");
        Scanner input = new Scanner(System.in);
        float v0 = input.nextFloat();
        float v1 = input.nextFloat();
        float t = input.nextFloat();
        // Compute the acceleration
        float a = (v1 - v0) / t;

        // Show the result
        System.out.printf("The average acceleration is %.4f", a);
    }
}
