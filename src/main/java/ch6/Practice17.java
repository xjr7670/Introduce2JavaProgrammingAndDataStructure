package ch6;

/**
 * Display matrix of 0s and 1s
 */

public class Practice17 {
    public static void printMatrix(int n) {
        int num;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num = Math.random() > 0.5 ? 1 : 0;
                System.out.print(num);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
