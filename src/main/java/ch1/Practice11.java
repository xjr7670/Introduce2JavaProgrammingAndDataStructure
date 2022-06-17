package ch1;

/**
 * Estimate the population
 */

public class Practice11 {
    public static void main(String[] args) {
        final long base = 312032486L;
        long roy = 365 * 24 * 3600 / 7 - 365 * 24 * 3600 / 13 + 365 * 24 * 3600 / 45;
        System.out.printf("Population for one year later: %d\n", base + roy);
        System.out.printf("Population for two years later: %d\n", base + roy * 2);
        System.out.printf("Population for three years later: %d\n", base + roy * 3);
        System.out.printf("Population for four years later: %d\n", base + roy * 4);
        System.out.printf("Population for five years later: %d\n", base + roy * 5);
    }
}
