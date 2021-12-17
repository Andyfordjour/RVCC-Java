package csit105demochapter07part3f20;

/**
 * This program demonstrates a two-dimensional array.
 *
 * @author Tony Gaddis (et al)
 */

public class CorpSalesRandom {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int DIVS = 3; // Three divisions in the company
        final int QTRS = 4; // Four quarters

        // Create an array to hold the sales for each
        // division(row), for each quarter(col).
        double[][] sales = new double[DIVS][QTRS];

        // Nested loops to fill the array with quarterly
        // sales figures for each division.
        for (int div = 0; div < DIVS; div++) {
            for (int qtr = 0; qtr < QTRS; qtr++) {
                sales[div][qtr] = Math.random() * 10000;
            }
        }

        // display column headers
        System.out.printf("%3s: %10s %10s %10s %10s\n",
                "Div", "Qtr 1", "Qtr 2", "Qtr 3", "Qtr 4");
        System.out.printf("%3s: %10s %10s %10s %10s\n",
                "===", "========", "========", "========", "========", "========");
        // Nested loops to display all the elements of the array.
        for (int div = 0; div < DIVS; div++) {
            // display row header
            System.out.printf("%3d: ", div);
            for (int qtr = 0; qtr < QTRS; qtr++) {
                System.out.printf("%,10.2f ", sales[div][qtr]);
            }
            System.out.println();
        }

    }
}
