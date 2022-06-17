package com.xjr7670.ch3;

import java.util.Scanner;

/**
 * 游戏：石头、剪刀、布
 */

public class Practice17 {
    public static void main(String[] args) {
        // Generate a number
        int num = (int) (Math.random() * 3);

        // Get user guess
        System.out.print("Scissor (0), rock (1), paper (2): ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        // 3. Compare the num and user input
        switch (num) {
            case 0:
                System.out.print("The computer is scissor, ");
                if (guess == 0) {
                    System.out.println("you are scissor too. It is a draw.");
                } else if (guess == 1) {
                    System.out.println("you are rock. You won");
                } else if (guess == 2) {
                    System.out.println("you are paper. You lose.");
                }
                break;
            case 1:
                System.out.print("The computer is rock, ");
                if (guess == 0) {
                    System.out.println("you are scissor, you lose.");
                } else if (guess == 1) {
                    System.out.println("you are rock too. It is a drew.");
                } else if (guess == 2) {
                    System.out.println("you are paper. You won.");
                }
                break;
            case 2:
                System.out.print("The computer is paper, ");
                if (guess == 0) {
                    System.out.println("you are scissor, you won.");
                } else if (guess == 1) {
                    System.out.println("you are rock, you lose.");
                } else if (guess == 2) {
                    System.out.println("you are paper too. It is a drew.");
                }
                break;
            default:
                System.out.println("The computer number is none of 1, 2, 3, it is: " + num);
        }
    }
}
