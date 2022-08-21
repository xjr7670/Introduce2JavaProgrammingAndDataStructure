package ch6;

/**
 * Display pattern
 */

public class Practice6 {
    public static void displayPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= 1; col--) {
                if (col > row) {
                    System.out.print("   ");
                } else {
                    System.out.printf("%3d", col);
                }
            }
            System.out.println();
        }
    }
}
