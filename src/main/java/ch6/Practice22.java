package ch6;

/**
 * Math: approximate the square root
 */

public class Practice22 {
    public static double sqrt(long n) {
        double lastGuess;
        double gap = 0.0001;
        double nextGuess = 1.0;

        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        } while (Math.abs(nextGuess - lastGuess) >= gap);

        return nextGuess;
    }
}
