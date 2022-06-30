package ch4;

import java.util.Scanner;

/**
 * Binary to decimal
 */

public class Practice11 {
    public static void main(String[] args) {
        // 1. Obtain user's input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary digits (0000) to (1111): ");
        int binary = input.nextInt();

        // 2. Convert
        double first = binary / 1000 * Math.pow(2, 3);
        double second = binary / 100 % 10 * Math.pow(2, 2);
        double third = binary % 100 / 10 * Math.pow(2, 1);
        double fourth = binary % 10 * Math.pow(2, 0);

        int sum = (int) (first + second + third + fourth);

        // 3. Display result
        System.out.printf("The decimal value is %d", sum);
    }
}
