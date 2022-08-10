package ch5;

/**
 * Simulation: heads or tails
 */

public class Practice40 {
    public static void main(String[] args) {
        int heads = 0, tails = 0;
        int times = 2000000;
        int temp = times;
        while (times-- > 0) {
            if (Math.random() >= 0.5) {
                ++heads;
            } else {
                ++tails;
            }
        }

        System.out.printf("heads count: %d, tails count %d\nThe head rate is %.5f\nThe tail rate is %.5f\n", heads, tails, heads * 1.0 / temp, tails * 1.0 / temp);
    }
}
