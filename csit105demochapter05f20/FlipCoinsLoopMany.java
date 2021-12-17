package csit105demochapter05f20;

import java.util.Scanner;
import java.util.Random;

/**
 * This program demonstrates Random Numbers in a loop
 *
 * @author Stephen Brower
 */
public class FlipCoinsLoopMany {

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
        int maxFlips;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many times should we flip the coin? ");
        maxFlips = keyboard.nextInt();

        //simulate flipping a coin multiple times and tally what we have
        for (numFlips = 1; numFlips <= maxFlips; numFlips++) {

            if (randomNumbers.nextBoolean()) {
                numHeads++; // add 1 to counter for heads
            } else {
                numTails++; // add 1 to counter for tails
            }
        }

        // display counters
        System.out.printf("\nTally:\n");
        System.out.printf("%s %,13d\n", "Heads", numHeads);
        System.out.printf("%s %,13d\n", "Tails", numTails);
    }
}
