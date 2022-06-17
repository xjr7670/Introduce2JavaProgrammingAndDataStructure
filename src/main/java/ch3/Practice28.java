package ch3;

import java.util.Scanner;

/**
 * Check if one rectangle is inside another
 */

public class Practice28 {
    public static void main(String[] args) {
        // 1. Obtain user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        float x1 = input.nextFloat();
        float y1 = input.nextFloat();
        float width1 = input.nextFloat();
        float height1 = input.nextFloat();
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        float x2 = input.nextFloat();
        float y2 = input.nextFloat();
        float width2 = input.nextFloat();
        float height2 = input.nextFloat();

        // 2. Check begin
        // 2.1 如果第二个矩形在第一个矩形内，那么：
        //         1) 矩形 2 的右边小于等于矩形 1 的右边；矩形 2 的左边大于等于矩形 1 的左边
        //         2) 矩形 2 的上边小于等于矩形 1 的上边；矩形 2 的下边大于等于矩形 1 的下边
        // 2.2 如果第二个矩形和第一个矩形重叠，那么：
        //         1) 两个矩形中心点的水平距离小于两个矩形各自宽的一半之和；矩形 2 的右边大于矩形 1 的右边，或者矩形 2 的左边小于矩形 1 的左边
        //         2) 两个矩形中心点的垂直距离小于两个矩形各自高的一半之和；矩形 2 的上边大于矩形 1 的上边，或者矩形 2 的下边小于矩形 1 的下边

        // 求水平距离、垂直距离
        float horizonDistance = Math.abs(x2 - x1);
        float verticalDistance = Math.abs(y2 -y1);

        // 求两个矩形的上下左右边的位置
        float rec1Left = x1 - width1/2;
        float rec1Right = x1 + width1/2;
        float rec1Top = y1 + height1/2;
        float rec1Bottom = y1 - height1/2;

        float rec2Left = x2 - width2/2;
        float rec2Right = x2 + width2/2;
        float rec2Top = y2 + height2/2;
        float rec2Bottom = y2 - height2/2;

        // 判断
        if ((rec2Right <= rec1Right) && (rec2Left >= rec1Left) && (rec2Top <= rec1Top) && (rec2Bottom >= rec1Bottom)) {
            System.out.println("r2 is inside r1");
        } else if ((horizonDistance < (width1/2 + width2/2)) && (rec2Right > rec1Right || rec2Left < rec1Left) &&
                (verticalDistance < (height1/2 + height2/2)) && (rec2Top > rec1Top || rec2Bottom < rec1Bottom)) {
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2 does not overlap r1");
        }
    }
}
