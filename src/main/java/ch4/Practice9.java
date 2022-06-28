package ch4;

import java.util.Scanner;

/**
 * Find the Unicode of a character
 */

public class Practice9 {
    public static void main(String[] args) {
        // 1. Obtain user's input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);

        // 2. Convert to unicode

        // 3. display result
        System.out.printf("The Unicode for the character %c is %d", ch, (int) ch);
    }
}
