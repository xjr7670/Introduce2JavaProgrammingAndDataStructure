package ch5;

import java.util.Scanner;

/**
 * 游戏：石头、剪刀、布
 */

public class Practice34 {
    public static void main(String[] args) {

        int computerWin = 0, userWin = 0;

        while (computerWin < 3 && userWin < 3) {
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
                        ++userWin;
                    } else if (guess == 2) {
                        System.out.println("you are paper. You lose.");
                        ++computerWin;
                    }
                    break;
                case 1:
                    System.out.print("The computer is rock, ");
                    if (guess == 0) {
                        System.out.println("you are scissor, you lose.");
                        ++computerWin;
                    } else if (guess == 1) {
                        System.out.println("you are rock too. It is a drew.");
                    } else if (guess == 2) {
                        System.out.println("you are paper. You won.");
                        ++userWin;
                    }
                    break;
                case 2:
                    System.out.print("The computer is paper, ");
                    if (guess == 0) {
                        System.out.println("you are scissor, you won.");
                        ++userWin;
                    } else if (guess == 1) {
                        System.out.println("you are rock, you lose.");
                        ++computerWin;
                    } else if (guess == 2) {
                        System.out.println("you are paper too. It is a drew.");
                    }
                    break;
                default:
                    System.out.println("The computer number is none of 1, 2, 3, it is: " + num);
            }
        }

        System.out.printf("Computer won %d times, you won %d times. ", computerWin, userWin);
        if (computerWin > userWin) {
            System.out.println("You lose!");
        } else {
            System.out.println("You win!");
        }
    }
}
