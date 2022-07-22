package ch5;

import java.util.Scanner;

/**
 * Display pyramid
 */

public class Practice17 {
    public static void main(String[] args) {
        // prompt user to enter an integer between 1 and 15
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number lines: ");
        int num = input.nextInt();

        int space;
        boolean descend = true;
        for (int i = 1; i <= num; i++) {
            space = num;
            while (space-- > i) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
                System.out.print(" ");
            }

            for (int k = 2; k <= i; k++) {
                System.out.print(k);
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
