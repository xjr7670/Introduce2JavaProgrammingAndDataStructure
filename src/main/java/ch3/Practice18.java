package com.xjr7670.ch3;

import java.util.Scanner;

/**
 * shipment cost
 */

public class Practice18 {
    public static void main(String[] args) {
        // 1. Obtain the weight
        System.out.println("Please enter the weight of goods: ");
        Scanner input = new Scanner(System.in);
        float weight = input.nextFloat();

        double cost = 0.0;

        if (weight <= 0) {
            System.out.println("Invalid input");
        } else if (weight > 20) {
            System.out.println("The package cannot be shipped.");
        } else if (weight <= 1) {
            cost = 3.5;
        } else if (weight <= 3) {
            cost = 5.5;
        } else if (weight <= 10) {
            cost = 8.5;
        } else if (weight <= 20) {
            cost = 10.5;
        }

        // 3. Display result
        System.out.println("The cost of shipment is :" + cost);
    }
}
