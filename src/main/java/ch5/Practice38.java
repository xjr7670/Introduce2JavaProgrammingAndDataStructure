package ch5;

import java.util.Scanner;

/**
 * Decimal to octal
 */

public class Practice38 {
    public static void main(String[] args) {
        // 1. Get user's input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int num = input.nextInt();
        int temp = num;
        String result = "";
        while (num >= 8) {
            result += num % 8;
            num = num / 8;
        }
        result += num;
        System.out.printf("Decimal number %d in octal is: ", temp);
        for (int i = result.length() - 1; i >= 0; i--) {
            System.out.print(result.charAt(i));
        }
        System.out.println();
    }
}
