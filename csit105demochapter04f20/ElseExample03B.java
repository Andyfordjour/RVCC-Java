package csit105demochapter04f20;

import java.util.Scanner;

/**
 *
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class ElseExample03B {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int outsideTemp;
        String weatherMessage;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter outside temperature: ");
        outsideTemp = keyboard.nextInt();

        if (outsideTemp <= 32) {
            weatherMessage = "Wear a heavy coat!";
        } else if (outsideTemp < 50) {
            weatherMessage = "Wear a jacket";
        } else if (outsideTemp < 60) {
            weatherMessage = "Wear a light jacket";
        } else {
            weatherMessage = "Wear no jacket";
        }

        System.out.println("\n" + weatherMessage);
        System.out.println("\nHave a nice day!");

    }
}
