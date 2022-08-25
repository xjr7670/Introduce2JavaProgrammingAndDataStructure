package ch6;

public class TestPractice13 {
    public static void main(String[] args) {
        System.out.printf("%4s\t\t%7s\n", "I", "m(i)");
        System.out.println("-------------------");
        for (int n = 1; n <= 20; n++) {
            System.out.printf("%-4d\t\t%7.4f\n", n, Practice13.mSum(n));
        }
    }
}
