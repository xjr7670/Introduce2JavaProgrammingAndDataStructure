package ch2;

import java.util.Scanner;

/**
 * Compute the area of a hexagon
 */

public class Practice16 {
    public static void main(String[] args) {
        // 1. Obtain the length of the side
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the side: ");
        float side = input.nextFloat();
        // 2. Compute the area of a hexagon
        double area = 3 * Math.pow(3, 0.5) / 2 * Math.pow(side, 2);
        // 3. Show the result
        System.out.printf("The area of the hexagon is %f", area);
    }
}
