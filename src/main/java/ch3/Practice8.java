package ch3;

import java.util.Scanner;

/**
 * Sort three number in non-descend order
 */
public class Practice8 {
    public static void main(String[] args) {
        // 1. Obtain three number
        System.out.println("Enter three numbers ");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        // 2. Sort
        int max, mid, min;
        if (n1 > n2) {
            if (n3 >= n1) {
                max = n3;
                mid = n2;
                min = n1;
            } else if (n3 <= n2) {
                max = n1;
                mid = n2;
                min = n3;
            } else {
                max = n1;
                mid = n3;
                min = n2;
            }
        } else { // n1 <= n2
            if (n3 >= n2) { // n3 >= n2 >= n1
                max = n3;
                mid = n2;
                min = n1;
            } else if (n3 <= n1) { // n3 <= n1 <= n2
                max = n2;
                mid = n1;
                min = n3;
            } else { // n1 < n3 < n2
                max = n2;
                mid = n3;
                min = n1;
            }
        }

        // 3. Display result
        System.out.printf("%d %d %d\n", max, mid, min);
    }
}
