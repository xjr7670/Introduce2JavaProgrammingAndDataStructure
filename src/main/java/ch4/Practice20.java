package ch4;

import java.util.Scanner;

/**
 * Process a string
 */

public class Practice20 {
    public static void main(String[] args) {
        // 1. Obtain a string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = input.nextLine();

        // 2. Check
        int len = s.length();
        char lastCh = s.charAt(len - 1);

        // 3. display result
        System.out.printf("%s's lenght is %d, it's last character is %c\n", s, len, lastCh);
    }
}
