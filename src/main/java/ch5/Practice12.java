package ch5;

/**
 * Find the smallest n such that pow(n, 3) > 12,000
 */

public class Practice12 {
    public static void main(String[] args) {
        System.out.println("The smallest n that pow(n, 3) > 12,000 is :");
        int nPow3 = 0, n = 0;

        while (Math.pow(n, 3) <= 12000) {
            ++n;
        }

        System.out.println(n);
    }
}
