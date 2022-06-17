package ch3;

import java.util.Scanner;

/**
 * Guess a coin
 */

public class Practice14 {
    public static void main(String[] args) {
        // 1. Obtain user input
        System.out.println("Enter 1 for the positive and 0 for the negative to a coin: ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        int num = Math.random() >= 0.5 ? 1 : 0;

        // 2. determine whether the input equals to the number
        if (guess == num) {
            System.out.println("You are right");
        } else {
            System.out.println("You are wrong!");
        }
        System.out.printf("The truth is %d\n", num);
    }
}
