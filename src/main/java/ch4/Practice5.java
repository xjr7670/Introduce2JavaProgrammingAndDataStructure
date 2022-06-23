package ch4;

import java.util.Scanner;

/**
 * Area of a regular polygon - 正多边形的面积
 */

public class Practice5 {
    public static void main(String[] args) {
        // 1. Prompt user to enter the number of sides and the length of each side
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int sides = input.nextInt();
        System.out.print("Enter the side: ");
        float length = input.nextFloat();

        // 2. Compute the area
        double area = (sides * length * length) / (4 * Math.tan(Math.PI / sides));

        // 3. Display result
        System.out.printf("The area of the polygon is %f", area);
    }
}
