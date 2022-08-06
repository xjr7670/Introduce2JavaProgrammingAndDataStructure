package ch5;

/**
 * Perfect number
 */

public class Practice33 {
    public static void main(String[] args) {
        int divisorsSum, divisor;
        for (int i = 1; i < 10000; i++) {
            divisor = 1;
            divisorsSum = 0;
            while (divisor <= i / 2) {
                if (i % divisor == 0) {
                    divisorsSum += divisor;
                }
                ++divisor;
            }
            if (divisorsSum == i) {
                System.out.printf("%d\t", i);
            }
        }
    }
}
