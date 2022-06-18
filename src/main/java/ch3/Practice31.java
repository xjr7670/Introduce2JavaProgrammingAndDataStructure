package ch3;

import java.util.Scanner;

/**
 * Currency exchange - U.S. dollar to Chinese RMB
 */

public class Practice31 {
    public static void main(String[] args) {
        // 1. Obtain user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollar to RMB: ");
        float rate = input.nextFloat();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int convertType = input.nextInt();

        String sourceCurrency = "";
        if (convertType == 0) {
            sourceCurrency = "dollar";
        } else if (convertType == 1) {
            sourceCurrency = "RMB";
        };
        
        System.out.printf("Enter the %s amount: ", sourceCurrency);
        float amount = input.nextFloat();

        // 2. Make convert
        double result = 0.0;
        String sourceSign = "$";
        String targetSign = "";
        if (convertType == 0) {
            result = amount / rate;
        } else {
            result = amount / rate;
            sourceSign = "";
            targetSign = "$";
        }

        // 3. Diaplay result
        System.out.printf("%s%f is %s%f\n", sourceSign, amount, targetSign, result);
    }
}
