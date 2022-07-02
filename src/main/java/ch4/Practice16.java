package ch4;

/**
 * Random character
 */

public class Practice16 {
    public static void main(String[] args) {
        // Generate a random number
        int rand = (int) Math.floor((Math.random() * 27));
        System.out.printf("A random character: %c", (char) (97+rand));
    }
}
