package ch6;

public class TestPractice15 {
    public static void main(String[] args) {
        // print table head
        System.out.printf("%7s\t\t%6s\t\t%12s\t\t%8s\t\t%7s\n", "Taxable", "Single", "Married Joint", "Married", "Head of");
        System.out.printf("%7s\t\t%6s\t\t%12s\t\t%8s\t\t%7s\n", "Income", "", "or Qualifying", "Separate", "a House");
        System.out.printf("%7s\t\t%6s\t\t%12s\t\t%8s\t\t%7s\n", "", "", "Window(er)", "", "");
        System.out.println("---------------------------------------------------------------------------------------------");

        double singleTax, MarriedJointTax, MarriedSepTax, HeadOfAHouseTax;

        for (int income = 50000; income <= 70000; income += 100) {
            singleTax = Math.round(Practice15.computeTax(0, income));
            MarriedJointTax = Math.round(Practice15.computeTax(1, income));
            MarriedSepTax = Math.round(Practice15.computeTax(2, income));
            HeadOfAHouseTax = Math.round(Practice15.computeTax(3, income));
            System.out.printf("%7d\t\t%6.0f\t\t%12.0f\t\t%8.0f\t\t%7.0f\n", income, singleTax, MarriedJointTax, MarriedSepTax, HeadOfAHouseTax);
        }
    }
}
