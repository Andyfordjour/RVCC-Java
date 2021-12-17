package csit105demochapter03f20;

/**
 * This program demonstrates the BankAccount class. Modified by Stephen Brower
 * 9/12/2012 for 2 accounts
 *
 * @author Tony Gaddis
 */
public class MultipleAccounts {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount savingsAccount, checkingAccount;  // To reference a BankAccount object

        double savingsBalanceStart = 3023.75, // savings account's starting balance
                savingsInterestRate = .02, // savings - monthly interest rate
                savingsDeposits = 987.56, // savings - total deposits
                savingsWithdrawals = 1350.23;           // savings - total withdrawals

        double checkingBalanceStart = 187.23, // checking account's starting balance
                checkingInterestRate = .012, // checking - monthly interest rate
                checkingDeposits = 2711.98, // checking - total deposits
                checkingWithdrawals = 2650.17;           // checking - total withdrawals

        double totalBalances;

        // Create a BankAccount object for savings.
        savingsAccount = new BankAccount(savingsBalanceStart, savingsInterestRate);

        // Create a BankAccount object for checking.
        checkingAccount = new BankAccount(checkingBalanceStart, checkingInterestRate);

        // SAVINGS
        processMonth(savingsAccount, savingsDeposits, savingsWithdrawals, "Savings");

        // CHECKING
        processMonth(checkingAccount, checkingDeposits, checkingWithdrawals, "Checking");

        // calculate grand total
        totalBalances = savingsAccount.getBalance() + checkingAccount.getBalance();

        // Display the grand total.
        System.out.printf("\n\n%-35s $%,9.2f\n", "Total Cash on hand", totalBalances);

    }

    public static void processMonth(BankAccount accountToProcess,
            double totalDeposits,
            double totalWithdrawals,
            String accountDescription) {
        // display starting balance
        System.out.printf("\n\n%-35s $%,9.2f\n", accountDescription + " - starting balance", accountToProcess.getBalance());

        // display deposits
        System.out.printf("\n%-35s +%,9.2f\n", accountDescription + " - total deposits", totalDeposits);

        // record deposits into the  account.
        accountToProcess.deposit(totalDeposits);

        System.out.printf("\n%-35s  %,9.2f\n", accountDescription + " - after deposits", accountToProcess.getBalance());

        // display withdrawals
        System.out.printf("\n%-35s -%,9.2f\n", accountDescription + " - total withdrawals", totalWithdrawals);

        // record Withdrawals from the  account.
        accountToProcess.withdraw(totalWithdrawals);

        System.out.printf("\n%-35s  %,9.2f\n", accountDescription + " - after withdrawals", accountToProcess.getBalance());

        // Add the monthly interest to the  account.
        accountToProcess.addInterest();

        // Display the interest earned
        System.out.printf("\n%-35s +%,9.2f\n", accountDescription + " - interest earned", accountToProcess.getInterest());

        // Display the final balance.
        System.out.printf("\n%-35s $%,9.2f\n", accountDescription + " - final balance", accountToProcess.getBalance());

    }

}
