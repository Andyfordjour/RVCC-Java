package csit105demochapter04f20;

import java.util.Scanner;

/**
 * Demo switch for last day of month this does not take into account leap
 * year!!!! Date written:	10/24/2004 Date modified:	10/22/2006 - tidied up
 * 9/27/2008 - removed loop 2/25/2009 - Added Scanner
 *
 * @author Stephen Brower
 */
public class LastDayOfMonth {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int month, lastDay;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month(1-12): ");
        month = input.nextInt();
        
        if (month >= 1 && month <= 12) {

            switch (month) {
                case 9: case 4: case 6: case 11:
                    lastDay = 30;
                    break;
                case 2:
                    lastDay = 28; // assumes not leap year
                    break;
                default:
                    lastDay = 31;
            }
            System.out.printf("\nThe last day of the month is %d/%d\n", month, lastDay);
            
        } else {
            System.out.println("\nInvalid Month!!!!");
        }

    }
}
