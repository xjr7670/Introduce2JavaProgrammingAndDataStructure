package ch3;

import java.util.Scanner;

/**
 * Two circles - Check if one circle is inside another
 */

public class Practice29 {
    public static void main(String[] args) {
        // 1. Obtain user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        float x1 = input.nextFloat();
        float y1 = input.nextFloat();
        float r1 = input.nextFloat();

        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        float x2 = input.nextFloat();
        float y2 = input.nextFloat();
        float r2 = input.nextFloat();

        // 2. Check distance
        double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

        if (distance <= r1 - r2) {
            System.out.println("circle2 is inside circle1");
        } else if (distance < r1 + r2 && distance > r1 - r2) {
            System.out.println("circle2 is overlaps circle1");
        } else {
            System.out.println("circle2 is not overlap circle1");
        }

    }
}
