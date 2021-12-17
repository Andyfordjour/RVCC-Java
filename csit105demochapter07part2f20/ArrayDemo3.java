package csit105demochapter07part2f20;


/**
 * This program demonstrates the declaration, allocation and
 * simple use of arrays
 * Date Modified:   11/19/2005 added 'pictures'
 *                  4/18/2007 - renamed and added comments
 *                  7/6/2015 - migrated to NetBeans
 * @author Concept by:  Tony Gaddis (et al) modified by Stephen Brower
 */

public class ArrayDemo3 {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // the following line declares prices
        // as an array of doubles
        // AND it allocates 6 elements
        // whoses subscripts are from 0-5

        double[] prices = new double[6];

        /*     prices           <--this picture is
              ----------        is to illustrate
            0 !   0.0  !        logically what is
              ----------        in memory after allocation
            1 !   0.0  !
              ----------
            2 !   0.0  !
              ----------
            3 !   0.0  !
              ----------
            4 !   0.0  !
              ----------
            5 !   0.0  !
              ----------
         */
        // these statements assign values to
        // the elements whose subscript
        // is given in [ ]
        prices[0] = 15.95;      // later we will see how
        prices[1] = 14.75;      // to do this in a loop
        prices[2] = 12.0;
        prices[3] = 11.5;
        prices[4] = 32.5;

        /*     prices           <--this picture is
              ----------        is to illustrate
            0 !  15.95 !        logically what is
              ----------        in memory after those
            1 !  14.75 !        5 assignments
              ----------
            2 !  12.0  !
              ----------
            3 !  11.5  !
              ----------
            4 !  32.5  !
              ----------
            5 !   0.0  !
              ----------
         */
        // these statements display the
        // first 5 elements of the array
        System.out.println(prices[0]); // later we will see how
        System.out.println(prices[1]); // to do this in a loop
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);
        // if we print System.out.println(prices[5]); //it will display 0
        // if we print System.out.println(prices[6]); //it will crash on run
    }
}
