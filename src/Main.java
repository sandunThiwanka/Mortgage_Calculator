public class Main {

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal loan amount: $", 1000, 1_000_000);
        float annualInterestRate = (float) Console.readNumber("Annual interest rate: ", 0.1, 100.0);
        byte years = (byte) Console.readNumber("Years: ", 1, 30);
        var calculator = new MortgageCalculator(principal, annualInterestRate, years);
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }
}
