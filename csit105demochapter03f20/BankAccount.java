package csit105demochapter03f20;

/**
 * BankAccount class This class simulates a bank account.
 *
 * @author Tony Gaddis
 */
public class BankAccount {

    private double balance;      // Account balance
    private double interestRate; // Interest rate
    private double interest;     // Interest earned

    /**
     * The constructor initializes the balance and interestRate fields with the
     * values passed to startBalance and intRate. The interest field is assigned
     * 0.0.
     *
     * @param startBalance value for starting balance
     * @param intRate value for the interestRate for the account
     */
    public BankAccount(double startBalance,
            double intRate) {
        balance = startBalance;
        interestRate = intRate;
        interest = 0.0;
    }

    /**
     * The deposit method adds the parameter amount to the balance field.
     *
     * @param amount the value to be added to the balance
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * The withdraw method subtracts the parameter amount from the balance
     * field.
     *
     * @param amount the value to be deducted from the balance
     */
    public void withdraw(double amount) {
        balance -= amount;
    }

    /**
     * The addInterest method adds the interest for the month to the balance
     * field.
     */
    public void addInterest() {
        interest = balance * interestRate;
        balance += interest;
    }

    /**
     * The getBalance method returns the value in the balance field.
     *
     * @return the value in the balance field
     */
    public double getBalance() {
        return balance;
    }

    /**
     * The getInterest method returns the value in the interest field.
     *
     * @return the value in the interest field
     */
    public double getInterest() {
        return interest;
    }
}
