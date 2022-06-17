package ch2;

import java.util.Scanner;

/**
 * Compute the area of a triangle
 */

public class Practice19 {
    public static void main(String[] args) {
        // 1. Obtain the coordinates of the three points of a triangle
        System.out.println("Enter the coordinates of three points separated by spaces\nlike x1 y1 x2 y2 x3 y3: ");
        Scanner input = new Scanner(System.in);
        float x1 = input.nextFloat();
        float y1 = input.nextFloat();
        float x2 = input.nextFloat();
        float y2 = input.nextFloat();
        float x3 = input.nextFloat();
        float y3 = input.nextFloat();

        // 2. Compute the area of this triangle
        double side1 = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);
        double side2 = Math.pow(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2), 0.5);
        double side3 = Math.pow(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2), 0.5);
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        // 3. Show the result
        System.out.printf("The area of the triangle is %f", area);

    }
}
