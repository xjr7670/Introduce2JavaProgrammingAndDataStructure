package ch4;

import java.util.Scanner;

/**
 * Find the character of an ASCII code
 */

public class Practice8 {
    public static void main(String[] args) {
        // 1. Obtain user's input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int code = input.nextInt();

        // 2. Convert to character
        char ch = (char) code;

        // 3. Display result
        System.out.printf("The character for ASCII code %d is %c", code, ch);
    }
}
