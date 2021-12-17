package csit105demochapter07part2f20;

/**
 *
 * BankAccount objects.
 *
 * @author Tony Gaddis (et al)
 */

public class ObjectArrayBankAccount {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int NUM_ACCOUNTS = 10;  // Number of accounts

        // Create an array that can reference
        // BankAccount objects.
        BankAccount[] accounts = new BankAccount[NUM_ACCOUNTS];

        /* note: at this point accounts[0] is null
                 accounts[0].getBalance() would result in
                 null pointer exception */
 /* System.out.println("Account " + (0 + 1) +
                     ": $" + accounts[0].getBalance()); */
        // Create objects for the array.
        createAccounts(accounts);

        // show objects in the array.
        showBankAccountArray(accounts);
    }

    /**
     * The createAccounts method creates a BankAccount object for each element
     * of an array - The account's balance is randomly generated.
     *
     * @param array The array to reference the accounts
     */
    private static void createAccounts(BankAccount[] array) {
        double balance;  // To hold an account balance

        // Create the accounts.
        for (int index = 0; index < array.length; index++) {
            balance = Math.random() * 1000.0;

            // Create the account.
            array[index] = new BankAccount(balance);
        }
    }

    /**
     * The showBankAccountArray method accepts an array of BankAccount as an
     * argument and displays its contents.
     *
     * @param array reference to array to be displayed
     */
    public static void showBankAccountArray(BankAccount[] array) {
        // Display the balances of each account.
        System.out.println("Here are the balances "
                + "of each account:");
        // Display the array elements.
        for (int index = 0; index < array.length; index++) {
            System.out.printf("Account %2d: $%,8.2f\n", (index + 1),
                    array[index].getBalance());
        }
    }
}
