package ch6;

/**
 * Display an integer reversed
 */

public class Practice4 {
    public static void reverse(int number) {
        while (number > 0) {
            System.out.print(number % 10);
            number /= 10;
        }
    }
}
