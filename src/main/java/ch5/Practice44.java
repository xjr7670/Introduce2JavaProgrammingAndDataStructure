package ch5;

import java.util.Scanner;

/**
 * Computer architecture: bit-level operations
 */

public class Practice44 {
    public static void main(String[] args) {
        // 1. Get user's input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        // 2. Convert with 8 bits
        String result = "";
        int upper;
        if (num < 256) {
            upper = 128;
        } else {
            upper = 32768;
        }
        int i = upper;
        while (i > 0) {
            if ((num & i) != 0) {
                result += "1";
            } else {
                result += "0";
            }
            i = i >> 1;
        }

        System.out.println("The 8 bits are: " + result);
    }
}
