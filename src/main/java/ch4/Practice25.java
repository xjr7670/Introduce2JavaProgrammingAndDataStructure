package ch4;

/**
 * Generate vehicle plate numbers
 */

public class Practice25 {
    public static void main(String[] args) {
        // 1. Generate three upper character
        char S1 = (char) (65 + Math.random() * 25);
        char S2 = (char) (65 + Math.random() * 25);
        char S3 = (char) (65 + Math.random() * 25);

        // 2. Generate four digits
        int d1 = (int) (Math.random() * 10 - 1);
        int d2 = (int) (Math.random() * 10 - 1);
        int d3 = (int) (Math.random() * 10 - 1);
        int d4 = (int) (Math.random() * 10 - 1);

        // 3. Display result
        System.out.printf("%c%c%c%d%d%d%d\n", S1, S2, S3, d1, d2, d3, d4);
    }
}
