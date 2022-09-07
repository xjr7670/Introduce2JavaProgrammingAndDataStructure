package ch6;

/**
 * Palindromic prime
 */

public class Practice26 {
    public static boolean isPrime(int number) {
        boolean flag = true;
        double end = Math.pow(number, 0.5);
        for (int i = 2; i <= end; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean isPalindromic(int number) {
        String strNum = String.valueOf(number);
        int len = strNum.length();
        double mid = len / 2.0;
        boolean flag = true;
        int left = 0, right = len - 1;
        while (left <= mid && right >= mid) {
            if (strNum.charAt(left) != strNum.charAt(right)) {
                flag = false;
                break;
            }
            ++left;
            --right;
        }

        return flag;
    }
}
