package csit105demochapter04f20;

import java.util.Random;

/**
 * This program is a Demo of Random Numbers Date Written:	10/25/2005 Date
 * Modified:	11/13/2006 - implemented printf 10/5/2008 - changed class name
 * added comments
 *
 * @author Stephen Brower
 */
public class DiceRoll {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random randomNumbers = new Random();
        int roll, die1, die2;
        final int NUM_SIDES_DICE = 6;

        // get two random numbers
        // .nextInt(NUM_SIDES_DICE) generates a random number from
        // 0-(NUM_SIDES_DICE-1) - so by adding 1
        // we get a number 1-NUM_SIDES_DICE
        die1 = 1 + randomNumbers.nextInt(NUM_SIDES_DICE);
        die2 = 1 + randomNumbers.nextInt(NUM_SIDES_DICE);

        // total the roll
        roll = die1 + die2;

        // display the results
        System.out.printf("Die1: %d\n", die1);
        System.out.printf("Die2: %d\n", die2);
        System.out.printf("\nRoll: %d\n", roll);
    }
}
