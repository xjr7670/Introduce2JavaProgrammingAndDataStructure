package ch6;

/**
 * Sum the digits in an integer
 */

public class Practice2 {
    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }
}
