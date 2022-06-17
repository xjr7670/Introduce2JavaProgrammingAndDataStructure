package ch2;

import java.util.Scanner;

/**
 * Get the length of the aircraft runway
 */

public class Practice12 {
    public static void main(String[] args) {
        // 1. Obtain the spped and the acceleration
        System.out.println("Enter speed and acceleration: ");
        Scanner input = new Scanner(System.in);
        float speed = input.nextFloat();
        float acceleration = input.nextFloat();
        // 2. Compute the length
        float length = speed * speed / (2 * acceleration);
        // 3. Show the result
        System.out.printf("The minimum runway length for this airplane is : %.3f", length);
    }
}
