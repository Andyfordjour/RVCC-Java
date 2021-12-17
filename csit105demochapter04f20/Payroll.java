package csit105demochapter04f20;

/**
 * This class holds values for hours worked and the hourly pay rate - It
 * calculates the gross pay and adds additional pay for overtime.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class Payroll {

    private double hoursWorked; // Number of hours worked
    private double payRate;     // The hourly pay rate

    /**
     * The constructor initializes the hoursWorked and payRate fields to 0.0.
     * @param initialHoursWorked value for the hoursWorked field
     * @param initialPayRate value for the payRate field
     */
    public Payroll(double initialHoursWorked, double initialPayRate) {
        hoursWorked = initialHoursWorked;
        payRate = initialPayRate;
    }

    /**
     * The setHoursWorked method accepts an argument that is stored in the
     * hoursWorked field.
     *
     * @param hours to be used for hourseWorked field
     */
    public void setHoursWorked(double hours) {
        hoursWorked = hours;
    }

    /**
     * The setPayRate method accepts an argument which is stored in the payRate
     * field.
     *
     * @param rate value to be used for payRate field
     */
    public void setPayRate(double rate) {
        payRate = rate;
    }

    /**
     * The getHoursWorked method returns the hoursWorked field.
     *
     * @return value from hoursWorked
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * The getPayRate method returns the payRate field.
     *
     * @return value from payRate
     */
    public double getPayRate() {
        return payRate;
    }

    /**
     * The getGrossPay method calculates and returns the gross pay - Overtime
     * pay is also included.
     *
     * @return calculated value of gross pay based on hoursWorked and payRate
     */
    public double getGrossPay() {
        double grossPay, // Holds the gross pay
                overtimePay;  // Holds pay for overtime

        // Determine whether the employee worked more
        // than 40 hours.
        if (hoursWorked > 40) {
            // Calculate regular pay for the first 40 hours.
            grossPay = 40 * payRate;

            // Calculate overtime pay at 1.5 times the regular
            // hourly pay rate.
            overtimePay = (hoursWorked - 40) * (payRate * 1.5);

            // Add the overtime pay to the regular pay.
            grossPay += overtimePay;
        } else {
            // No overtime worked.
            grossPay = payRate * hoursWorked;
        }

        return grossPay;
    }
}
