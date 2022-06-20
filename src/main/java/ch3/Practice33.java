package ch3;

import java.util.Scanner;

/**
 * compare cost
 */

public class Practice33 {
    public static void main(String[] args) {
        // 1. Obtain user's input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        float weight1 = input.nextFloat();
        float price1 = input.nextFloat();
        System.out.print("Enter weight and price for package 2: ");
        float weight2 = input.nextFloat();
        float price2 = input.nextFloat();

        // 2. Check and display result
        if (price1 / weight1 < price2 / weight2) {
            System.out.println("package 1 has a better price.");
        } else if (price1 / weight1 == price2 / weight2) {
            System.out.println("Two package have the same price.");
        } else {
            System.out.println("package 2 has a better price.");
        }
    }
}
