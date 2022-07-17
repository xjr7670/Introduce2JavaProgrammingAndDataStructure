package ch5;

import java.util.Scanner;

/**
 * Find the highest score
 */

public class Practice8 {
    public static void main(String[] args) {
        // 1. Prompt user to enter the number of students and each student's name and score
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String highestScoreName = "";
        double highestScore = 0.0;
        String name;
        double score;

        while (numberOfStudents > 0) {
            System.out.printf("Enter the student's name and score of No.%d: ", numberOfStudents--);
            name = input.next();
            score = input.nextDouble();
            if (score > highestScore) {
                highestScoreName = name;
                highestScore = score;
            }
        }

        System.out.printf("%s got the highest score of %.2f\n", highestScoreName, highestScore);
    }
}
