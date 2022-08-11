package ch5;

/**
 * Math: combinations
 */

public class Practice43 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 7; i++) {
            for (int j = i+1; j <= 7; j++) {
                if (i != j) {
                    System.out.printf("%d\t%d\n", i, j);
                    ++count;
                }
            }
        }
        System.out.printf("The total number of all combinations is %d\n", count);
    }
}
