package ch6;

/**
 * Mersenne prime
 */

public class Practice28 {
    public static long mersennePrime(int p) {
        return Math.round(Math.pow(2, p) - 1);
    }

    public static boolean isPrime(int number) {
        boolean flag = true;
        int end = (int) Math.pow(number, 0.5);
        for (int i = 2; i <= end; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
