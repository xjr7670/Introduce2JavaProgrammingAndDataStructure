package ch5;

/**
 * Compute e
 */

public class Practice26 {
    public static void main(String[] args) {
        double e = 1.0, item = 1.0;
        int times = 100000;
        e += item;
        for (int i = 2; i <= times; i++) {
            item /= i;
            e += item;
        }
        System.out.printf("i = %d, e = %f\n", times, e);
    }
}
