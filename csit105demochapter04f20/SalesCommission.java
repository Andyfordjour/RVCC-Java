package csit105demochapter04f20;

/**
 * This class calculates a salesperson's gross pay based on the amount of sales.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class SalesCommission {

    private double sales, // Monthly sales
            advance;    // advanced pay

    /**
     * The constructor uses two parameters to accept arguments: s and a. The
     * value in s is assigned to the sales field and the value in a is assigned
     * to the advance field.
     *
     * @param newSales value for sales field
     * @param newAdvance value for the advance field
     */
    public SalesCommission(double newSales, double newAdvance) {
        sales = newSales;
        advance = newAdvance;
    }

    /**
     * The calculateRate method determines the rate of commission, based on the
     * amount of sales.
     *
     * @return the calculated rate
     */
    public double calculateRate() {
        double rate;

        if (sales < 10000) {
            rate = 0.05;
        } else if (sales < 15000) {
            rate = 0.1;
        } else if (sales < 18000) {
            rate = 0.12;
        } else if (sales < 22000) {
            rate = 0.14;
        } else {
            rate = 0.16;
        }

        return rate;
    }

    /**
     * The calculatePay method calculates the salesperson's commission and
     * amount of actual pay.
     *
     * @return pay based on commission - advanced pay
     */
    public double calculatePay() {
        return calculateCommission() - advance;
    }

    /**
     * The calculateCommission method returns the commission amount.
     *
     * @return commission amount based on sales and calculated rate
     */
    public double calculateCommission() {
        return sales * calculateRate();
    }

    /**
     * The getAdvance method returns the advance field.
     *
     * @return value in advance field
     */
    public double getAdvance() {
        return advance;
    }

    /**
     * The getSales method returns the sales field.
     *
     * @return value in sales field
     */
    public double getSales() {
        return sales;
    }
}
