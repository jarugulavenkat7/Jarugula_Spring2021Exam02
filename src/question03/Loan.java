/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class Loan {

    private double amount;
    private int timePeriodInYears;
    private double rateOfInterest;

    public Loan(double amount, int timePeriodInYears, double rateOfInterest) {
        this.amount = amount;
        this.timePeriodInYears = timePeriodInYears;
        this.rateOfInterest = rateOfInterest;
    }

    public double getAmount() {
        return amount;
    }

    public int getTimePeriodInYears() {
        return timePeriodInYears;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public double getTotalInterest() {
        return (this.amount * this.timePeriodInYears * this.rateOfInterest) / 100;
    }

    @Override
    public String toString() {
        return "***************** Loan Details *****************"
                + "\nLoan Amount                    : " + "$" + String.format("%.2f", this.getAmount())
                + "\nTime Period                    : " + this.timePeriodInYears + " years"
                + "\nRate of interest               : " + String.format("%.2f", this.getRateOfInterest()) + "%"
                + "\nTotal interest to be paid      : " + "$" + String.format("%.2f", this.getTotalInterest())
                + "\nTotal Loan Amount to be paid   : " + "$" + String.format("%.2f", this.getAmount() + this.getTotalInterest());
    }

}
