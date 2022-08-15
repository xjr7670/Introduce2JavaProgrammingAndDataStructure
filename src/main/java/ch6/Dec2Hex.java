package ch6;

import java.util.Locale;
import java.util.Scanner;

/**
 * Case Study: Converting Hexadecimals to decimals
 */

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase(Locale.ROOT)));
    }

    private static int hexToDecimal(String hex) {

        int decimalValue = 0;

        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexChartoDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexChartoDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else {
            return ch - '0';
        }
    }
}
