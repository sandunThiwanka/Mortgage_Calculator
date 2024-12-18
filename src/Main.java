import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENTAGE = 100;

        int principal = 0;
        float annualInterestRate = 0;
        byte years = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Principal loan amount: ");
            principal = scanner.nextInt();
            if (principal > 1000 && principal <= 1_000_000) {
                break;
            }
            System.out.println("Enter value between 1000 and 1,000,000 !");
        }

        while(true) {
            System.out.print("Annual interest rate: ");
            annualInterestRate = scanner.nextFloat();
            if (annualInterestRate > 0.0 && annualInterestRate <= 100.0) {
                break;
            }
            System.out.println("Enter value between 0 and 100 !");
        }

        float monthlyInterestRate = annualInterestRate / MONTH_IN_YEAR / PERCENTAGE;

        while (true) {
            System.out.print("Time Period (Years): ");
            years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                break;
            }
            System.out.println("Enter value between 1 and 30 !");
        }

        int numberOfPayments = years * MONTH_IN_YEAR;
        double mortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
