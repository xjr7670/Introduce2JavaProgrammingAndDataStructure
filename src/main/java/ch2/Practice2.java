package ch2;

/**
 * Calculate the cylinder's volume
 * */

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // Get the user input for the radius and the length of a cylinder
        System.out.println("Enter the radius and length of a cylinder: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double length = input.nextDouble();
        // Calculate the area
        double area = radius * radius * Math.PI;
        System.out.printf("The area is %f\n", area);
        // Calculate the volume
        double volumn = area * length;
        // Print the result to the console
        System.out.printf("The volume is %f", volumn);
    }
}
