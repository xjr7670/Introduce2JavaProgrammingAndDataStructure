package ch6;

/**
 * Estimated π
 */

public class Practice14 {
    public static double estimatePi(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(-1, i+1) / (2 * i - 1);
        }

        return 4 * sum;
    }
}
