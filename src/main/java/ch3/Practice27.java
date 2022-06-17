package com.xjr7670.ch3;

import java.util.Scanner;

/**
 * Check if a point inside the triangle
 */

public class Practice27 {

    public static void main(String[] args) {
        System.out.println("Enter a point's x- and y-coordinates:");
        Scanner input = new Scanner(System.in);
        double x = input.nextFloat();
        double y = input.nextFloat();

        boolean flag = (!(x < 0) && !(x > 200)) && (!(y < 0) && !(y > 100));

        // 根据斜率算用户所输入的点的截距
        double k = 100.0 / -200;
        double b = y  - k * x;
        if (b < 0 || b > 100) {
            flag = false;
        }

        if (flag) {
            System.out.println("The point is in the triangle");
        } else {
            System.out.println("The point is not in the triangle.");
        }
    }
}
