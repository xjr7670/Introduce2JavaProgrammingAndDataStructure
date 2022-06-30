package ch4;

import java.util.Locale;
import java.util.Scanner;

/**
 * Vowel or consonant?
 */

public class Practice13 {
    public static void main(String[] args) {
        // 1. Obtain user's input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        char ch = letter.toLowerCase(Locale.ROOT).charAt(0);

        // 2. Estimate
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.printf("%s is a vowel\n", letter);
        } else if (ch > 'a' && ch <= 'z') {
            System.out.printf("%s is a consonant\n", letter);
        } else {
            System.out.printf("%s is an invalid input\n", letter);
        }
    }
}
