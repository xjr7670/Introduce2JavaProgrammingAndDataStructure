package ch5;

import java.util.Scanner;

/**
 * Business application: checking ISBN
 */

public class Practice36 {
    public static void main(String[] args) {
        // get user input
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int temp = number;
        int n9 = 0;
        System.out.print(n9);
        for (int i = 9; i >= 2; i--) {
            n9 += number % 10 * i;
            number /= 10;
        }

        n9 %= 11;

        System.out.print(temp);
        if (n9 == 10) {
            System.out.println("X");
        } else {
            System.out.println(n9);
        }
    }
}
