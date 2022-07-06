package ch4;

import java.util.Scanner;

/**
 * Financial application: payroll
 */

public class Practice23 {
    public static void main(String[] args) {
        // 1. Get some information
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        // 2. Process... print employee's information
        double grossPay = hours * rate;
        double federalWithholding = grossPay * federalTax;
        double stateWithholding = grossPay * stateTax;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        System.out.printf("Employee Name: %s\n", name);
        System.out.printf("Hours Worked: %.2f\n", hours);
        System.out.printf("Pay Rate: %.2f\n", rate);
        System.out.printf("Gross Pay: %.2f\n", grossPay);
        System.out.println("Deductions: ");
        System.out.printf("\tFederal Withholding (%.2f%%): $%.2f\n", federalTax * 100, federalWithholding);
        System.out.printf("\tState Withholding (%.2f%%): $%.2f\n", stateTax * 100, stateWithholding);
        System.out.printf("Net Pay: $%.2f\n", netPay);
    }
}
