public class MortgageCalculator {

    private final static byte MONTH_IN_YEAR = 12;
    private final static byte PERCENTAGE = 100;

    private double principal;
    private float annualInterestRate;
    private byte years;

    public MortgageCalculator(double principal, float annualInterestRate, byte years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    public double calculateBalance(
            short numberOfPaymentsMade) {

        float monthlyInterestRate = getMonthlyInterestRate();
        int numberOfPayments = getNumberOfPayments();
        double balance = principal
                * (Math.pow(1 + monthlyInterestRate, numberOfPayments)
                - Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        return balance;
    }
    //Method for Calculate mortgage
    public double calculateMortgage() {
        float monthlyInterestRate = getMonthlyInterestRate();
        int numberOfPayments = getNumberOfPayments();

        double mortgage;
        mortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        return mortgage;
    }

    public double[] getRemainingBalance() {
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = calculateBalance(month);
        return balances;
    }

    private float getMonthlyInterestRate() {
        return annualInterestRate / MONTH_IN_YEAR / PERCENTAGE;
    }

    private int getNumberOfPayments() {
        return years * MONTH_IN_YEAR;
    }

}
