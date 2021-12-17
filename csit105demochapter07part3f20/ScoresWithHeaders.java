package csit105demochapter07part3f20;

/**
 ** This program demonstrates a 2-d array
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class ScoresWithHeaders {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] scores = new double[3][4];

        scores[2][1] = 95.0;

        // display column headers - once
        
        //first - display space to accomodate the row headers
        System.out.print("     ");
        
        // then loop to display column numbers
        for (int col = 0; col < 4; col++) {
            System.out.printf("%6d ", col);
        }
        System.out.println(); // end of col headers issue carriage return

        // want to display lines under column headers? do that here
        
        // display array
        for (int row = 0; row < 3; row++) {
            // display row header - one for each row
            System.out.printf("%3d: ", row);
            // display all columns for a particular row
            for (int col = 0; col < 4; col++) {
                System.out.printf("%6.2f ", scores[row][col]);
            }
            System.out.println();// end of row - issue carriage return 
        }

    }
}
