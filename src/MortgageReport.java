import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }
    //Method for print mortgage
    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("Monthly Payment");
        System.out.println("---------------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
    //Method for print payment schedule
    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for(double balance : calculator.getRemainingBalance())
            System.out.println(currency.format(balance));
    }
}
