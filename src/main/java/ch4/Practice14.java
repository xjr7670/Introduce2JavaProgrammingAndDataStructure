package ch4;

import java.util.Scanner;

/**
 * Convert letter grade to number
 */

public class Practice14 {
    public static void main(String[] args) {
        // 1. Prompt user to enter a letter grade A, B, C, D or E
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String letter = input.nextLine();
        char grade = letter.charAt(0);

        // 2. Estimate
        int numberGrade = 0;
        switch (grade) {
            case 'A':
                numberGrade = 4;
                break;
            case 'B':
                numberGrade = 3;
                break;
            case 'C':
                numberGrade = 2;
                break;
            case 'D':
                numberGrade = 1;
                break;
            case 'E':
                numberGrade = 0;
                break;
            default:
                System.out.printf("%s is an invalid grade\n", letter);
                System.exit(1);
        }

        System.out.printf("The numeric value for grade %s is %d\n", letter, numberGrade);
    }
}
