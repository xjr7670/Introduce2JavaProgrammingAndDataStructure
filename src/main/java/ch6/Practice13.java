package ch6;

/**
 * Sum series
 */

public class Practice13 {
    public static double mSum(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += i / (i + 2.0);
        }

        return sum;
    }
}
