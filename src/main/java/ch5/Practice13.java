package ch5;

/**
 * Find the largest n such that pow(n, 2) < 12,000
 */

public class Practice13 {
    public static void main(String[] args) {
        System.out.println("The largest n that pow(n, 2) < 12,000 is: ");
        int nPow2 = 0, n = 0;

        while (Math.pow(n, 2) < 12000) {
            ++n;
        }
        System.out.println(n);
    }
}
