package com.xjr7670.ch3;

/**
 * Draw
 */

public class Practice24 {
    public static void main(String[] args) {
        // Generate two random digit
        int digit = (int) (Math.random() * 13) + 1;
        int flower = (int) (Math.random() * 4) + 1;

        String strDigit = "";
        String strFlower = "";
        // 2. Sign the name to them
        switch (digit) {
            case 1:
                strDigit = "Ace";
                break;
            case 11:
                strDigit = "Jack";
                break;
            case 12:
                strDigit = "Queen";
                break;
            case 13:
                strDigit = "King";
                break;
            default:
                strDigit = String.valueOf(digit);
        }

        switch (flower) {
            case 1:
                strFlower = "Clubs";
                break;
            case 2:
                strFlower = "Diamonds";
                break;
            case 3:
                strFlower = "Hearts";
                break;
            case 4:
                strFlower = "Spades";
                break;
            default:
                strFlower = "invalid value";
        }

        // 3. Display result
        System.out.printf("The card you picked is %s of %s", strDigit, strFlower);
    }
}
