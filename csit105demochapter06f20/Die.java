package csit105demochapter06f20;

import java.util.Random;

/**
 * The Die class simulates a six-sided die.
 */
public class Die {

    private int sides;   // Number of sides
    private int value;   // The die's value

    /**
     * The constructor performs an initial roll of the die
     *
     * @param numSides The number of sides for the die
     */
    public Die(int numSides) {
        sides = numSides;
        roll();
    }

    /**
     * The roll method simulates the rolling of the die.
     */
    public void roll() {
        // Create a Random object.
        Random rand = new Random();

        // Get a random value for the die.
        value = rand.nextInt(sides) + 1;
    }

    /**
     * The getSides method returns the number of sides for the die.
     *
     * @return value in sides field
     */
    public int getSides() {
        return sides;
    }

    /**
     * The getValue method returns the value of the die.
     *
     * @return value in value field
     */
    public int getValue() {
        return value;
    }
}
