package ch5;

import java.util.Scanner;

/**
 * Pass or fail
 */

public class Practice1 {
    public static void main(String[] args) {
        // 1. Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score: ");
        double score = input.nextDouble();

        // 2. Check
        while (score != -1) {
            if (score < 60) {
                System.out.println("You don't pass the exam");
            } else {
                System.out.println("You pass the exam");
            }
            System.out.print("Enter your score: ");
            score = input.nextDouble();
        }

        // 3. Exit the program
        System.out.println("No numbers are entered except 0");
        System.exit(1);
    }
}
