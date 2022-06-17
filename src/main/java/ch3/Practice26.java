package com.xjr7670.ch3;

import java.util.Scanner;

/**
 * Use the operation symbol of &&, ||, and ^
 */

public class Practice26 {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.printf("Is %d divisible by 5 and 6? %b\n", number, number % 5 == 0 && number % 6 == 0);
        System.out.printf("Is %d divisible by 5 or 6? %b\n", number, number % 5 == 0 || number % 6 == 0);
        System.out.printf("Is %d divisible by 5 or 6, but not both? %b", number, number % 5 == 0 ^ number % 6 == 0);
    }
}
