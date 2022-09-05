package ch6;

import java.util.Scanner;

public class TestPractice23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();
        System.out.print("Enter a letter that you want to count: ");
        char c = input.nextLine().charAt(0);

        System.out.printf("The %c in the given string appeared %d times\n", c, Practice23.count(str, c));
    }
}
