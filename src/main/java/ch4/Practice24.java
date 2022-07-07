package ch4;

import java.util.Scanner;

/**
 * Order three countries
 */

public class Practice24 {
    public static void main(String[] args) {
        // 1. Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first country: ");
        String country1 = input.nextLine();
        System.out.print("Enter the second country: ");
        String country2 = input.nextLine();
        System.out.print("Enter the third country: ");
        String country3 = input.nextLine();



        String temp;
        if (country1.compareTo(country2) <= 0) {                //
            temp = country1;                                    //
            country1 = country2;                                //
            country2 = temp;                                    //
        }                                                       //
        if (country1.compareTo(country3) <= 0) {                // 经过前面的两次交换
            temp = country1;                                    // 将最大的字符串放到了 country1
            country1 = country3;                                //
            country3 = temp;                                    //
        }                                                       // 接下来
        if (country2.compareTo(country3) <= 0) {                // 只需要比较剩下的两个字符串即可
            temp = country3;                                    //
            country3 = country2;
            country2 = temp;
        }


        // 3. display result
        System.out.printf("The three countries in descending order are %s, %s, %s\n", country1, country2, country3);
    }
}
