package ch5;

/**
 * Demonstrate cancellation errors
 */

public class Practice23 {
    public static void main(String[] args) {
        double sum = 0.0;
        int left = 1;
        int right = 50000;
        // from left to right
        while (left <= right) {
            sum += 1.0 / left;
            ++left;
        }
        System.out.printf("Summation of left to right: %.10f\n", sum);
        sum = 0.0;
        left = 1;
        while (right >= left) {
            sum += 1.0 / right;
            --right;
        }
        System.out.printf("Summation of right to left: %.10f\n", sum);
    }
}
