package ch5;

/**
 * Summation
 */

public class Practice35 {
    public static void main(String[] args) {
        double sum = 0.0, item1 = Math.sqrt(1), item2 = Math.sqrt(2);

        for (int i = 0; i < 1000; i++) {
            sum += 1 / (item1 + item2);
            item1 = item2;
            item2 = Math.sqrt(i + 1);
        }

        System.out.printf("The result of this summation is : %.3f\n", sum);
    }
}
