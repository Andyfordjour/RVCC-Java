package csit105demochapter06f20;

import java.util.Scanner;

/**
 * This program demonstrates comparing Car objects Date written: 10/12/2011
 *
 * @author Stephen Brower
 */
public class CarCompare {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables
        Car carThought = new Car(1965, "Shelby Mustang");
        Car carGuessed;
        int yearEntered;
        String makeEntered;
        Scanner input = new Scanner(System.in);

        // get data
        System.out.println("I'm thinking of a car...can you guess which one?\n");
        System.out.print("Enter year: ");
        yearEntered = Integer.parseInt(input.nextLine());

        System.out.print("Enter make: ");
        makeEntered = input.nextLine();

        // create guessed object
        carGuessed = new Car(yearEntered, makeEntered);

        if (carGuessed.equals(carThought)) {
            System.out.println("\nYou got it!");
        } else {
            System.out.println("\noooh sorry....I was thinking of a "
                    + carThought.getYearModel() + " "
                    + carThought.getMake());
        }
    }
}
