package ch6;

import java.util.Scanner;

public class TestPractice19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three sides of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (Practice19.isValid(side1, side2, side3)) {
            System.out.printf("The area of this triangle is: %.3f\n", Practice19.area(side1, side2, side3));
        } else {
            System.out.println("Not a valid triangle.");
        }
    }
}
