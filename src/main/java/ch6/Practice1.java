package ch6;

/**
 * Math: pentagonal numbers
 */

public class Practice1 {
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
