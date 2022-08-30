package ch6;

import java.util.Scanner;

/**
 * Check password
 */

public class Practice18 {
    public static boolean isValid(String password) {
        boolean ret = true;
        password = password.toLowerCase();
        int len = password.length();
        int digitCount = 0;
        char c;
        if (len < 10) {
            return false;
        }
        for (int i = len - 1; i >= 0; i--) {
            c = password.charAt(i);
            if (c >= 48 && c <= 57) {
                ++digitCount;
            } else if (c < 97 || c > 122) {
                ret = false;
            }
        }

        if (digitCount < 3) {
            ret = false;
        }

        return ret;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String pass = input.nextLine();
        if (isValid(pass)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
