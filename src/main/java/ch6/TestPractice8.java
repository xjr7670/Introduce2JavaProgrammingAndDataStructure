package ch6;

public class TestPractice8 {
    public static void main(String[] args) {
        double kilometers, miles;
        int kilos;
        System.out.println("Miles\t\tKilometers\t|\tKilometers\tMiles");
        for (int m = 1; m <= 10; m++) {
            kilos = 15 + m * 5;
            kilometers = Practice8.mileToKilometer(m);
            miles = Practice8.kilometerToMile(kilos);
            System.out.printf("%-2d\t\t\t%.3f\t\t|\t%2d\t\t\t%.3f\n", m, kilometers, kilos, miles);
        }
    }
}
