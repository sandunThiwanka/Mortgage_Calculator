import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENTAGE = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal loan amount: ");
        int principal = scanner.nextInt();

        System.out.print("Annual interest rate: ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate / MONTH_IN_YEAR / PERCENTAGE;

        System.out.print("Time Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTH_IN_YEAR;

        double mortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
