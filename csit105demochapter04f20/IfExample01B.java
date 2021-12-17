package csit105demochapter04f20;

import java.util.Scanner;

/**
 * This program is a Demo of the if statement.
 * @author Stephen T. Brower
 */
public class IfExample01B {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int outsideTemp;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter outside temperature: ");
        outsideTemp = keyboard.nextInt();        
        
        if (outsideTemp < 60) {
            System.out.println("Wear a coat");
        }

        System.out.println("\nHave a nice day!");
    }   
}
