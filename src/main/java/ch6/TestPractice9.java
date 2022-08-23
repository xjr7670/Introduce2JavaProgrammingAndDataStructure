package ch6;

public class TestPractice9 {
    public static void main(String[] args) {
        double pounds, kilograms, p;
        System.out.printf("%9s\t%6s\t|\t%6s\t%9s\n", "Kilograms", "Pounds", "Pounds", "Kilograms");
        for (int k = 1; k < 200; k += 2) {
            p = 17.5 + k * 2.5;
            pounds = Practice9.kilogramToPound(k);
            kilograms = Practice9.poundToKilogram(p);
            System.out.printf("%-9d\t%-6.1f\t|\t%-6.0f\t%-9.2f\n", k, pounds, p, kilograms);
        }
    }
}
