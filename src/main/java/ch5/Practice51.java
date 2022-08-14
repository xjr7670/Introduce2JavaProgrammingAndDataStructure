package ch5;

import java.util.Scanner;

/**
 * Longest common prefix
 */

public class Practice51 {
    public static void main(String[] args) {
        method2();
    }

    public static void method1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = input.nextLine();

        boolean hasCommonPrefix = false;

        String commonPrefix = "";
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                commonPrefix += String.valueOf(s1.charAt(i));
                hasCommonPrefix = true;
            } else if (i == 0) {
                break;
            }
        }

        if (hasCommonPrefix) {
            System.out.printf("The common prefix is %s\n", commonPrefix);
        } else {
            System.out.printf("%s and %s has no common prefix.\n", s1, s2);
        }
    }

    public static void method2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = input.nextLine();

        int i;
        for (i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                break;
            }
        }

        if ( i != 0) {
            System.out.printf("The common prefix is %s\n", s1.substring(0, i));
        } else {
            System.out.printf("%s and %s has no common prefix.\n", s1, s2);
        }
    }
}
