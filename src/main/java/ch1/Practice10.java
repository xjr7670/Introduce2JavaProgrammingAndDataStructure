package ch1;

import java.util.Arrays;

public class Practice10 {
    public static void main(String[] args) {
        final long base = 312032486L;
        final double secondOfYear = 365 * 24 * 3600;
        double delta = secondOfYear / 45.0 + secondOfYear / 7.0 - secondOfYear / 13.0;
        System.out.print("第一年：");
        System.out.println(Math.round(base + delta));
        System.out.print("第二年：");
        System.out.println(Math.round(base + delta * 2));
        System.out.println("第三年： " + Math.round(base + delta * 3));
        System.out.println("第四年： " + Math.round(base + delta * 4));
        System.out.println("第五年： " + Math.round(base + delta * 5));
    }
}
