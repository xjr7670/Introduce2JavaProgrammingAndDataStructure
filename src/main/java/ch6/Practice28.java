package ch6;

/**
 * Mersenne prime
 */

public class Practice28 {
    public static long mersennePrime(int p) {
        return Math.round(Math.pow(2, p) - 1);
    }
}
