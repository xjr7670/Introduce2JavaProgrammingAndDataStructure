package ch6;

public class TestPractice16 {
    public static void main(String[] args) {
        System.out.printf("%5s\t%4s\n", "Year", "Days");
        System.out.println("--------------------------");
        for (int y = 2014; y <= 2034; y++) {
            System.out.printf("%5d\t%4d\n", y, Practice16.numberOfDaysInAYear(y));
        }
    }
}
