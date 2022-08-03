package ch5;

/**
 * Sum a series
 */

public class Practice24 {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i <= 99; i += 2) {
            sum += i / (i + 2.0);
        }
        System.out.printf("The summation of this series is: %.2f\n", sum);
    }
}
