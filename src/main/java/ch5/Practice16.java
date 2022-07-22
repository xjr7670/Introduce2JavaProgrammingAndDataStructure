package ch5;

import java.util.Scanner;

/**
 * Find the factors of an integer
 */

public class Practice16 {
    public static void main(String[] args) {
        // prompt user to enter an integer
        System.out.print("please enter an integer: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int n = 2;
        while ((n < num / 2)) {
            if (num % n == 0) {
                System.out.print(n);
                System.out.println(" ");
                num = num / n;
                n = 2;
                continue;
            }
            ++n;
        }
        System.out.println(num);
    }
}
