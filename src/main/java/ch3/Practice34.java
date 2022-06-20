package ch3;

import java.util.Scanner;

/**
 * Point on the line segment.
 */

public class Practice34 {
    public static void main(String[] args) {
        // 1. Obtain user's input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        float x0 = input.nextFloat();
        float y0 = input.nextFloat();
        float x1 = input.nextFloat();
        float y1 = input.nextFloat();
        float x2 = input.nextFloat();
        float y2 = input.nextFloat();

        // 2. check
        double flag = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        if (flag == 0 && (x2 >= x0 && x2 <= x1)) {
            System.out.printf("(%f, %f) is on the line segment from (%f, %f) to (%f, %f).", x2, y2, x0, y0, x1, y2);
        } else {
            System.out.printf("(%f, %f) is not on the line segment from (%f, %f) to (%f, %f).", x2, y2, x0, y0, x1, y1);
        }
    }
}
