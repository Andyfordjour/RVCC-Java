package csit105demochapter07part2f20;

/**
 * This program demonstrates comparing arrays
 *
 * @author Tony Gaddis (et al)
 */
public class CompareArrays {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] firstArray = {2, 4, 6, 8, 10};
        int[] secondArray = {2, 4, 6, 8, 10};

        boolean arraysEqual = true;
        int i = 0;

        if (firstArray.length != secondArray.length) {
            arraysEqual = false;
        }

        while (arraysEqual && i < firstArray.length) {
            if (firstArray[i] != secondArray[i]) {
                arraysEqual = false;
            }
            i++;
        }

        if (arraysEqual) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }
}
