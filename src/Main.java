import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int principal = (int) readNumber("Principal loan amount: ",1000, 1_000_000 );
        float annualInterestRate = (float) readNumber("Annual interest rate: ", 0.0, 100.0);
        short years = (short) readNumber("Years: ", 1, 30);
        double mortgage = calculateMortgage(principal, annualInterestRate, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

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

    public static double calculateMortgage(int principal, float annualInterestRate, short years) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENTAGE = 100;

        float monthlyInterestRate = annualInterestRate / MONTH_IN_YEAR / PERCENTAGE;
        int numberOfPayments = years * MONTH_IN_YEAR;

        double mortgage;
        mortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        return mortgage;
    }
}
