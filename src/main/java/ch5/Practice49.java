package ch5;

import java.util.Locale;
import java.util.Scanner;

/**
 * Count vowels and consonants
 */

public class Practice49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = input.nextLine();
        s = s.toLowerCase(Locale.ROOT);

        char c;
        int vowel = 0, consonant = 0;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                ++vowel;
            } else if (c >= 97 && c <= 123) {
                ++consonant;
            }
        }

        System.out.printf("The number of vowels is: %d\n", vowel);
        System.out.printf("The number of consonants is: %d\n", consonant);
    }
}
