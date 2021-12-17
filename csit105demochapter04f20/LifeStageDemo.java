package csit105demochapter04f20;

import java.util.Scanner;

/**
 * This program references LifeStage class to demo booleans
 *
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class LifeStageDemo {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables
        int ageEntered;
        LifeStage stageOfLife;
        Scanner input = new Scanner(System.in);

        // get data
        System.out.print("How old are you? ");
        ageEntered = input.nextInt();

        // create object
        stageOfLife = new LifeStage(ageEntered);

        // display results
        System.out.println("\nOld enough to vote:  " + stageOfLife.oldEnoughToVote());
        System.out.println("Old enough to drink: " + stageOfLife.oldEnoughToDrink());

        System.out.println("\nAlternatively...");

        if (stageOfLife.oldEnoughToVote()) {
            System.out.println("\nOld enough to vote...vote early and vote often");
        } else {
            System.out.println("\nNot old enough to vote");
        }

        if (stageOfLife.oldEnoughToDrink()) {
            System.out.println("Old enough to drink...please drink responsibly");
        } else {
            System.out.println("Not old enough to drink...have a soda!");
        }

    }
}
