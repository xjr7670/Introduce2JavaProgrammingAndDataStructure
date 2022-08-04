package ch5;

/**
 * Compute ⫪
 */

public class Practice25 {
    public static void main(String[] args) {
        int sign = -1;
        double pi = 0.0;
        int times = 100000;
        for (int i = 1; i <= times; i += 2) {
            sign *= -1;
            pi += (1.0 / i) * sign;
        }
        pi = 4 * pi;
        System.out.printf("i = %d, pi = %f\n", times, pi);
    }
}
