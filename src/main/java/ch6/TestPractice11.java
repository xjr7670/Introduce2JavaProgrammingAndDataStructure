package ch6;

public class TestPractice11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount\tCommission");
        System.out.println("--------------------------");
        double commission;
        for (int amount = 10000; amount <= 100000; amount += 5000) {
            commission = Practice11.computeCommission(amount);
            System.out.printf("%-12d\t%10.1f\n", amount, commission);
        }
    }
}
