package csit105demochapter07part3f20;

/**
 *
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class RaggedAndRandom {
    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] numbers = new int [4][];
        numbers[0] = new int [4];
        numbers[1] = new int [3];
        numbers[2] = new int [6];
        numbers[3] = new int [5];
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = (int) (Math.random() * 10000);
            }
        }        
        int grandTotal = 0;
        int rowTotal;
        
        int maxRowLength = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].length > maxRowLength)
                maxRowLength = numbers[i].length;   
        }
        
        int[] colTotal = new int[maxRowLength]; 
        
        // Display the number of rows.
        System.out.println("The number of rows is "
                + numbers.length);

        // Display the number of columns in each row.
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("The number of columns "
                    + "in row " + index + " is "
                    + numbers[index].length);
        }

        // calc grand total
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                grandTotal += numbers[row][col];
            }
        }

        System.out.println("\nData:\n");

        // Nested loops to display all the elements of the array.
        for (int row = 0; row < numbers.length; row++) {
            rowTotal = 0; // initialize row accumulator to 0
            for (int col = 0; col < numbers[row].length; col++) {
                // accumulate row element
                rowTotal += numbers[row][col];
                // accumulare col element
                colTotal[col] += numbers[row][col];
                // display item
                System.out.printf("%,6d ", numbers[row][col]);
            }
            // display row total
            if (numbers[row].length < maxRowLength)
                for (int i = maxRowLength; i > numbers[row].length; i--)
                    System.out.print("       ");
            System.out.printf(":%,6d\n", rowTotal);
        }

        // display column lines
        for (int col = 0; col < maxRowLength; col++) {
            System.out.printf("%6s ", "------");
        }
        System.out.println();

        // display column totals
        for (int col = 0; col < maxRowLength; col++) {
            System.out.printf("%,6d ", colTotal[col]);
        }
        System.out.println();

        System.out.printf("\nGrand Total is %,6d\n", grandTotal);
    }
    
}
