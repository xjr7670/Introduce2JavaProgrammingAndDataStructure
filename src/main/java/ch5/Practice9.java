package ch5;

import java.util.Scanner;

/**
 * Find the tow lowest scores
 */

public class Practice9 {
    public static void main(String[] args) {
        // 1. prompts the user to enter the number of students and each student's name and score
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int nums = input.nextInt();

        // 2. loop it and estimate them
        String lowestName = "", secondLowestName = "", name, tempName;
        double lowestScore = 102.0, secondLowestScore = 101.0, score, tempScore;

        while (nums > 0) {
            System.out.printf("Enter name and score of student No.%d: ", nums--);
            name = input.next();
            score = input.nextDouble();

            if (score < secondLowestScore) {
                secondLowestScore = score;
                secondLowestName = name;
            }
            if (secondLowestScore < lowestScore) {
                tempScore = lowestScore;
                lowestScore = secondLowestScore;
                secondLowestScore = tempScore;

                tempName = lowestName;
                lowestName = secondLowestName;
                secondLowestName = tempName;
            }
        }

        System.out.printf("The lowest score and the student's name is : %.2f, %s\n", lowestScore, lowestName);
        System.out.printf("The second lowest score and the student's name is : %.2f, %s\n", secondLowestScore, secondLowestName);
    }
}
