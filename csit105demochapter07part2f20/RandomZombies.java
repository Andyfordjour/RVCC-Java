package csit105demochapter07part2f20;

import java.util.Random;

/**
 * This program is Zombie Approved
 *
 * @author Stephen Brower
 */
public class RandomZombies {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables
        Random randomNumbers = new Random();
        final int NUM_SECTORS = 10;
        int[] numZombiesInSector = new int[NUM_SECTORS];
        int sector;
        int maxZombiesLocation, minZombiesLocation;

        // randomly initialize zombies in sectors
        for (sector = 0; sector < NUM_SECTORS; sector++) {
            numZombiesInSector[sector] = randomNumbers.nextInt(100) + 1; // 1-100
        }
        // find location of most and least zombies
        maxZombiesLocation = 0;
        minZombiesLocation = 0;
        for (sector = 0; sector < NUM_SECTORS; sector++) {
            // does this sector have more zombies than where we think is max?
            if (numZombiesInSector[sector] > numZombiesInSector[maxZombiesLocation]) {
                maxZombiesLocation = sector; // set max loaction here
            }
            // does this sector have less zombies than where we think is min?
            if (numZombiesInSector[sector] < numZombiesInSector[minZombiesLocation]) {
                minZombiesLocation = sector; // set min loaction here
            }
        }

        // display zombies in sectors
        System.out.printf("%6s %7s\n", "Sector", "Zombies");
        for (sector = 0; sector < NUM_SECTORS; sector++) {
            // display zombies
            System.out.printf("%6d %7d", sector, numZombiesInSector[sector]);

            // if max or min display appropriate message
            if (sector == maxZombiesLocation) {
                System.out.println(" <== you're going here first!");
            } else if (sector == minZombiesLocation) {
                System.out.println(" <== I'm going here first.");
            } else {
                System.out.println();
            }
        }

        // summary report
        System.out.println("\nThe least number of zombies are in sector " + minZombiesLocation
                + " with a total of " + numZombiesInSector[minZombiesLocation] + " zombies");
        System.out.println("\nThe most number of zombies are in sector " + maxZombiesLocation
                + " with a total of " + numZombiesInSector[maxZombiesLocation] + " zombies");
        System.out.println("\nGood luck...you'll need it!\n");
    }
}
