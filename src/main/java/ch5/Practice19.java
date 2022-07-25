package ch5;

/**
 * Display number in a pyramid pattern
 */

public class Practice19 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) { // 控制行
            for (int j = 7; j >= 0; j--) {
                if (j > i) { // 输出 空格
                    System.out.print("     ");
                } else {    // 输出 数字
                    System.out.printf("%5d", Math.round(Math.pow(3, (i - j))));
                }
            }
            for (int k = i - 1; k >= 0; k--) {
                System.out.printf("%5d", Math.round(Math.pow(3, k)));
            }
            System.out.println();
        }
    }
}
