import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static byte MONTH_IN_YEAR = 12;
    final static byte PERCENTAGE = 100;

    public static void main(String[] args) {

        int principal = (int) readNumber("Principal loan amount: ", 1000, 1_000_000);
        float annualInterestRate = (float) readNumber("Annual interest rate: ", 0.0, 100.0);
        short years = (short) readNumber("Years: ", 1, 30);
        double mortgage = calculateMortgage(principal, annualInterestRate, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        printMortgage(mortgageFormatted);
        printPaymentSchedule(mortgageFormatted, years, principal, annualInterestRate);
    }
    //Method for print mortgage
    private static void printMortgage(String mortgageFormatted) {
        System.out.println();
        System.out.println("Monthly Payment");
        System.out.println("---------------");
        System.out.println(mortgageFormatted);
    }
    //Method for print payment schedule
    private static void printPaymentSchedule(String mortgageFormatted, short years, int principal, float annualInterestRate) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        System.out.println(mortgageFormatted);
        for (short month = 1; month <= years * MONTH_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterestRate, years, month);
            String balanceFormatted = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(balanceFormatted);
        }
    }
    //Method for calculate Balance
    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("Enter value between " + min + " and " + max);
        }
        return value;
    }

    //Method for calculate Balance
    public static double calculateBalance(
            double principal,
            float annualInterestRate,
            short years,
            short numberOfPaymentsMade) {

        float monthlyInterestRate = annualInterestRate / MONTH_IN_YEAR / PERCENTAGE;
        int numberOfPayments = years * MONTH_IN_YEAR;
        double balance = principal
                * (Math.pow(1 + monthlyInterestRate, numberOfPayments)
                - Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        return balance;
    }

    //Method for Calculate mortgage
    public static double calculateMortgage(int principal, float annualInterestRate, short years) {
        float monthlyInterestRate = annualInterestRate / MONTH_IN_YEAR / PERCENTAGE;
        int numberOfPayments = years * MONTH_IN_YEAR;

        double mortgage;
        mortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        return mortgage;
    }
}
