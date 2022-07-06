package ch4;

import java.util.Scanner;

/**
 * Check substring
 */

public class Practice22 {
    public static void main(String[] args) {
        // 1. Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string S1: ");
        String s1 = input.nextLine();
        System.out.print("Enter String S2: ");
        String s2 = input.nextLine();

        // 2. Check
        int n = s1.indexOf(s2);

        // 3. Display result
        if (n >= 0) {
            System.out.printf("%s is a substring of %s\n", s2, s1);
        } else {
            System.out.printf("%s is not a substring of %s\n", s2, s1);
        }
    }
}
