package ch4;

import java.util.Scanner;

/**
 * Student major and status
 */

public class Practice18 {
    public static void main(String[] args) {
        // 1. Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String ch = input.nextLine();

        // 2. Split
        char major = ch.charAt(0);
        char status = ch.charAt(1);

        // 3. Check and display result
        String majorName = "", statusName = "";

        switch (major) {
            case 'M':
                majorName = "Mathematics";
                break;
            case 'C':
                majorName = "Computer Science";
                break;
            case 'I':
                majorName = "Information technology";
                break;
            default:
                System.out.print("Invalid input\n");
                System.exit(1);
        }

        switch (status) {
            case '1':
                statusName = "Freshman";
                break;
            case '2':
                statusName = "Sophomore";
                break;
            case '3':
                statusName = "Junior";
                break;
            case '4':
                statusName = "Senior";
                break;
            default:
                System.out.print("Invalid input\n");
                System.exit(1);
        }

        System.out.printf("%s %s\n", majorName, statusName);
    }
}
