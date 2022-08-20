package ch6;

import java.util.Scanner;

public class TestPractice5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        Practice5.displaySortedNumbers(n1, n2, n3);
    }
}
