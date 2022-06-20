package ch3;

import java.util.Scanner;

/**
 * Point position
 */

public class Practice32 {
    public static void main(String[] args) {
        // 1. Obtain user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        float x0 = input.nextFloat();
        float y0 = input.nextFloat();
        float x1 = input.nextFloat();
        float y1 = input.nextFloat();
        float x2 = input.nextFloat();
        float y2 = input.nextFloat();

        // 2. Check and display result
        double flag = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        if (flag > 0) {
            System.out.println("p2 is on the left side of the line.");
        } else if (flag == 0) {
            System.out.println("p2 in on the same line.");
        } else {
            System.out.println("p2 is on the right side of the line.");
        }
    }
}
