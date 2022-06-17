package com.xjr7670.ch3;

import java.util.Scanner;

/**
 * perimeter of triangle
 */

public class Practice19 {
    public static void main(String[] args) {
        // 1. Obtain the three side's length of a triangle
        System.out.println("Enter the three side's length of a triangle: ");
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        // 2. Estimate whether it is a valid triangle, if it is, compute the perimeter
        double perimeter = 0.0;
        if (a + b > c || a + c > b || b + c > a) {
            perimeter = a + b + c;
        } else {
            System.out.println("Invalid triangle");
            System.exit(1);
        }

        // 3. Display result
        System.out.println("The perimeter of this triangle is: " + perimeter);
    }
}
