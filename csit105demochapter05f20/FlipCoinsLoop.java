package csit105demochapter05f20;

import java.util.Random;

/**
 * This program demonstrates Random Numbers in a loop Date Written:	10/7/2009
 *
 * @author Stephen Brower
 */
public class FlipCoinsLoop {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random randomNumbers = new Random();
        int numHeads = 0; // initialize counter for heads to 0
        int numTails = 0; // initialize counter for tails to 0
        int numFlips;

        //simulate flipping a coin multiple times and tally what we have
        for (numFlips = 1; numFlips <= 10; numFlips++) {

            if (randomNumbers.nextBoolean()) {
                System.out.println("Heads ");
                numHeads++; // add 1 to counter for heads
            } else {
                System.out.println("\tTails ");
                numTails++; // add 1 to counter for tails
            }
        }

        // display counters
        System.out.printf("\n\nTally:\n");
        System.out.printf("%s %,10d\n", "Heads", numHeads);
        System.out.printf("%s %,10d\n", "Tails", numTails);
    }
}
