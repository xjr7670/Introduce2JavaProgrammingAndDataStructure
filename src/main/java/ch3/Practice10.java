package ch3;

import java.util.Scanner;

/**
 * random add
 */

public class Practice10 {
    public static void main(String[] args) {
        // Generate two random integer
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        // add them
        System.out.println("Enter your guess: ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        int result = number1 + number2;

        // display result
        System.out.printf("What is %d + %d?\nYour guess is %b, ", number1, number2, guess == result);
    }
}
