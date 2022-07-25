package ch5;

/**
 * Display four patterns using loops
 */

public class Practice18 {
    public static void main(String[] args) {
        patternD();
    }

    public static void patternA() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternB() {
        for (int i = 6; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternC() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= 1; j--) {
                if (j > i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void patternD() {
        for (int i = 6; i >= 1; i--) {
            for (int j = 6; j >= 1; j--) {
                if (j > i) {
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
