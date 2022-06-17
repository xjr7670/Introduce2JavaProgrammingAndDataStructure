package com.xjr7670.ch3;

import java.util.Scanner;

/**
 * check if a point is inside a rectangle
 */
public class Practice23 {
    public static void main(String[] args) {
        // 1. Obtain a point's coordinate
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        float x = input.nextFloat();
        float y = input.nextFloat();

        // 2. Check it
        if (Math.abs(x) <= 5 && Math.abs(y) <= 2.5) {
            System.out.printf("Point (%f, %f) is in the rectangle.", x, y);
        } else {
            System.out.printf("Point (%f, %f) is not in the rectangle.", x, y);
        }
    }
}
