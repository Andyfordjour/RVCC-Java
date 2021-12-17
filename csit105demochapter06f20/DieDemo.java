package csit105demochapter06f20;

/**
 *
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class DieDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int SIDES = 6; // Number of sides for the dice

        // Create the two dice. (This also rolls them.)
        Die die1 = new Die(SIDES);
        Die die2 = new Die(SIDES);

        // dispplay their values.
        System.out.println("Die 1: " + die1.getValue());
        System.out.println("Die 2: " + die2.getValue());

        System.out.println("\nRoll...");
        die1.roll();
        die2.roll();

        // dispplay their values.
        System.out.println("\nDie 1: " + die1.getValue());
        System.out.println("Die 2: " + die2.getValue());

    }
}
