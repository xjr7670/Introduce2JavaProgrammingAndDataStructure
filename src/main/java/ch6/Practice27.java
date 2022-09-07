package ch6;

/**
 * Emirp - A nonpalindromic prime number whose reversal is also a prime
 */

public class Practice27 {
    public static boolean isPrime(int number) {
        boolean flag = true;
        double end = Math.pow(number, 0.5);
        for (int n = 2; n <= end; n++) {
            if (number % n == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static int reverseNumber(int number) {
        String strNum = new StringBuilder(String.valueOf(number)).reverse().toString();
        return Integer.parseInt(strNum);
    }
}
