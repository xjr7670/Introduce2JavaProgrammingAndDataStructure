package ch4;

import java.util.Locale;
import java.util.Scanner;

/**
 * Phone key pads
 */

public class Practice15 {
    public static void main(String[] args) {
        // 1. Obtain user's input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        char ch = letter.toLowerCase(Locale.ROOT).charAt(0);

        // 2. Convert
        int key = 0;
        int intChar = (int) ch;
        if (intChar >= 97 && intChar <= 121) {
            key = (int) Math.ceil((intChar - 96) / 3.0) + 1;
        } else if (intChar == 122) {
            key = 9;
        } else {
            System.out.printf("%s is an invalid input\n", letter);
            System.exit(1);
        }

        System.out.printf("The corresponding number is %d\n", key);

        // display result

    }
}
