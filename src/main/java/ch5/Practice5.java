package ch5;

/**
 * Conversion from ℃ to ℉ and ℉ to℃
 */

public class Practice5 {
    public static void main(String[] args) {
        // print table title
        System.out.println("Celsius\tFahrenheit\t|\tFahrenheit\tCelsius");
        double fahrenheit = 0.0, celsius = 0.0;
        for (int i = 0, j = 20; i <= 100; i += 2, j += 5) {
            fahrenheit = i * 9 / 5.0 + 32;
            celsius = (j - 32) * 5.0 / 9;
            System.out.printf("%d\t\t%10.3f\t|\t%d\t\t%11.3f\n", i, fahrenheit, j, celsius);
        }
    }
}
