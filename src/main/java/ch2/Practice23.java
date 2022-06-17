package ch2;

import java.util.Scanner;

/**['{"lyb":"lyb1","lybzd":"lybzd1"}', '{"lyb":lyb2","lybzd":"lybzd2"}']
 * the cost of a ride
 */

public class Practice23 {
    public static void main(String[] args) {
        // 1. Obtain the user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        float distance = input.nextFloat();
        System.out.print("Enter miles per gallon: ");
        float milesPerGallon = input.nextFloat();
        System.out.print("Enter price per gallon: ");
        float price = input.nextFloat();

        // 2. Compute the cost
        double cost = distance / milesPerGallon * price;

        // 3. Display the result
        System.out.printf("The cost of driving is $%f", cost);
    }
}
