package ch6;

/**
 * Palindrome integer
 */

public class Practice3 {
    public static int reverse(int number) {
        String sNum = String.valueOf(number);
        String result = "";
        for (int i = sNum.length() - 1; i >= 0; i--) {
            result += sNum.charAt(i);
        }

        return Integer.parseInt(result);
    }

    public static boolean isPalindrome(int number) {
        if (number == reverse(number)) {
            return true;
        } else {
            return false;
        }
    }
}
