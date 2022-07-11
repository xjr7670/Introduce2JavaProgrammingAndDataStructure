package ch5;

/**
 * Conversion from ℃ to ℉
 */

public class Practice3 {
    public static void main(String[] args) {
        // Print title
        System.out.println("Celsius\t\tFahrenheit");
        double fahrenheit = 0.0;
        for (int celsius = 0; celsius <= 100; celsius+=2) {
            fahrenheit = celsius * 9.0 / 5 + 32;
            System.out.printf("%d\t\t%.2f\n", celsius, fahrenheit);
        }
    }
}
