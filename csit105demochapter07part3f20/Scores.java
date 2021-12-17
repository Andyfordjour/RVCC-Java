package csit105demochapter07part3f20;

/**
 * This program demonstrates a 2-d array
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class Scores {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] scores = new double[3][4];

        scores[2][1] = 95.0;

        // display array
        // c
        for (int row = 0; row < 3; row++) {
            // display all columns for a particular row
            System.out.printf("%2d ",row);
            for (int col = 0; col < 4; col++) {
                // display element
                System.out.printf("%6.2f ", scores[row][col]);
            }
            System.out.println(); // issue carriage return
        }

    }

}
