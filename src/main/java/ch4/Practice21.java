package ch4;

import java.util.Scanner;

/**
 * Check SSN
 */

public class Practice21 {
    public static void main(String[] args) {
        // 1. Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String ssn = input.nextLine();

        // 2. Check
        char ch0 = ssn.charAt(0);
        char ch1 = ssn.charAt(1);
        char ch2 = ssn.charAt(2);
        char ch3 = ssn.charAt(3);
        char ch4 = ssn.charAt(4);
        char ch5 = ssn.charAt(5);
        char ch6 = ssn.charAt(6);
        char ch7 = ssn.charAt(7);
        char ch8 = ssn.charAt(8);
        char ch9 = ssn.charAt(9);

        boolean flag = true;
        if (ch3 != '-' || ch6 != '-') {
            flag = false;
        }
        if (Character.isDigit(ch0) && Character.isDigit(ch1) && Character.isDigit(ch2)
        && Character.isDigit(ch4) && Character.isDigit(ch5) && Character.isDigit(ch7)
        && Character.isDigit(ch8) && Character.isDigit(ch9)) {
            flag = true;
        } else {
            flag = false;
        }

        if (ssn.length() != 11) {
            flag = false;
        }

        // 3. Display result
        if (flag) {
            System.out.printf("%s is a valid social security number\n", ssn);
        } else {
            System.out.printf("%s is an invalid social security number\n", ssn);
        }
    }
}
