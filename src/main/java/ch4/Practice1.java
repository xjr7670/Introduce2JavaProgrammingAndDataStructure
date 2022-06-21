package ch4;

import java.util.Scanner;

/**
 * Area of pentagon
 */

public class Practice1 {
    public static void main(String[] args) {
        // 1. Create a Scanner
        Scanner input = new Scanner(System.in);
        // 2. Prompt user to enter the center
        System.out.print("Enter the length from the center to a vertex: ");
        float length = input.nextFloat();

        // 3. Compute the area
        double s = 2 * length * Math.sin(Math.PI / 5);
        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));

        // 4. Display result
        System.out.printf("The area of the pentagon is %f", area);
    }
}
