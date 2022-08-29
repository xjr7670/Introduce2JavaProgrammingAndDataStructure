package ch6;

import java.util.Scanner;

public class TestPractice17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = input.nextInt();
        Practice17.printMatrix(n);
    }
}
