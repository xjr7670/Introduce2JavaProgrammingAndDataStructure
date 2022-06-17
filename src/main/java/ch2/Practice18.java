package ch2;

/**
 * Print a table
 */

public class Practice18 {
    public static void main(String[] args) {
        System.out.println("a\tb\tpow(a, b)");
        System.out.printf("1\t2\t%d\n", Math.round(Math.pow(1, 2)));
        System.out.printf("2\t3\t%d\n", Math.round(Math.pow(2, 3)));
        System.out.printf("3\t4\t%d\n", Math.round(Math.pow(3, 4)));
        System.out.printf("4\t5\t%d\n", Math.round(Math.pow(4, 5)));
        System.out.printf("5\t6\t%d\n", Math.round(Math.pow(5, 6)));
    }
}
