package ch5;

import java.util.Scanner;

/**
 * Business: Check ISBN-13
 */

public class Practice47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits for an ISBN-13 as a string: ");
        String isbn12 = input.nextLine();

        if (isbn12.length() != 12) {
            System.out.printf("%s is not a valid input\n", isbn12);
            System.exit(1);
        }

        int midSum = 0;
        double flagSum = 4, flag = 1;
        for (int i = 0; i < isbn12.length(); i++) {
            midSum += flag * (isbn12.charAt(i) - '0');
            flag = flagSum - flag;
        }
        int d13 = 10 - midSum % 10;
        if (d13 == 10) {
            d13 = 0;
        }

        System.out.printf("The ISBN-13 number is: %s%d\n", isbn12, d13);
    }
}
