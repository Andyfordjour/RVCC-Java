package csit105demochapter08f20;

import java.util.Scanner; // Needed for the Scanner class
import java.io.*;    // Needed for IOException

/**
 * demo of .split()
 *
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class SodaSales {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args)
            throws IOException {
        String filename = "SodaSales.txt";
        String lineRead;
        String[] tokens;
        final int MAX_NUM_SODAS = 10;
        String[] sodaName = new String[MAX_NUM_SODAS];
        int[][] sodaSalesByQuarter = new int[MAX_NUM_SODAS][4];
        int numSodas = 0;
        int rowTotal;
        int[] qtrTotal = new int[4];

        // Open the file.
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        // while file has data and array not full
        while (inputFile.hasNext() && numSodas < MAX_NUM_SODAS) {
            // read an entire line from the file
            lineRead = inputFile.nextLine();

            // split the lineread into an array of strings
            tokens = lineRead.split(",");

            if (tokens.length == 5) {
                // for this demo, assume each line has 5 elements
                // store soda name
                sodaName[numSodas] = tokens[0];

                // tokens 1-4 contain the quarters
                for (int quarter = 1; quarter <= 4; quarter++) {
                    sodaSalesByQuarter[numSodas][quarter - 1] = Integer.parseInt(tokens[quarter].trim());
                }

                numSodas++;
            }
            else
                System.out.println("Bad Data: " + lineRead);
        }

        // close the file
        inputFile.close();

        // echo back what we read
        // display column headers
        System.out.printf("%-20s ", "Soda Name");
        for (int quarter = 0; quarter < 4; quarter++) {
            System.out.printf("%3s%d ", "Q", quarter + 1);
        }
        System.out.printf("%6s\n\n", "Total");

        // display data
        for (int soda = 0; soda < numSodas; soda++) {
            rowTotal = 0;

            // display soda as row header
            System.out.printf("%-20s ", sodaName[soda]);

            // display quarter data
            for (int quarter = 0; quarter < 4; quarter++) {
                System.out.printf("%4d ", sodaSalesByQuarter[soda][quarter]);
                // total row
                rowTotal += sodaSalesByQuarter[soda][quarter];
                // total col
                qtrTotal[quarter] += sodaSalesByQuarter[soda][quarter];
            }
            System.out.printf("%,6d\n", rowTotal);
        }

        // display quarter totals
        rowTotal = 0;

        System.out.printf("\n%-20s ", "Total");
        for (int quarter = 0; quarter < 4; quarter++) {
            System.out.printf("%4d ", qtrTotal[quarter]);
            rowTotal += qtrTotal[quarter];
        }
        System.out.printf("%,6d\n", rowTotal);

    }

}
