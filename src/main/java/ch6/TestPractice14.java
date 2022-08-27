package ch6;

public class TestPractice14 {
    public static void main(String[] args) {
        System.out.printf("%-10s%6.4s\n", "i", "m(i)");
        System.out.println("--------------------");
        for (int i = 1; i < 1000; i+=100) {
            System.out.printf("%-10d\t%6.4f\n", i, Practice14.estimatePi(i));
        }
    }
}
