package ch5;

import java.util.Scanner;

/**
 * Decimal to binary
 */

public class Practice37 {
    public static void main(String[] args) {
        // 1. get user's input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = input.nextInt();
        int temp = number;
        // 2. Convert to binary
        int y = number;
        String result = "";
        while (number > 1) {
            y = number % 2;
            result += y;
            number /= 2;
        }

        result += number;

        System.out.printf("%d convert to binary is: ", temp);
        for (int i = result.length() - 1; i >= 0; i--) {
            System.out.print(result.charAt(i));
        }
        System.out.println();
    }
}
