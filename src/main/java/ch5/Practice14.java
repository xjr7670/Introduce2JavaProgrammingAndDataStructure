package ch5;

import java.util.Scanner;

/**
 * Compute the greatest common divisor
 */

public class Practice14 {
    public static void main(String[] args) {
        // 1. Prompt user to enter n1 and n2
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers for n1, n2: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int d = Math.min(n1, n2);
        while (d > 0) {
            if (n1 % d == 0 && n2 % d == 0) {
                System.out.printf("The common divisor of %d and %d is %d\n", n1, n2, d);
                System.exit(1);
            }
            --d;
        }
        System.out.printf("No common divisor for %d and %d", n1, n2);
    }
}
