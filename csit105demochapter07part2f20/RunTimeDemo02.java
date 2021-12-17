package csit105demochapter07part2f20;

import java.util.Random;

/**
 * This program...
 *
 * @author Stephen Brower
 */
public class RunTimeDemo02 {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // depedning on available memory, you may
        // need to lower the # of elements
        int[] data = new int[40000000];
        int lookForValue = 42;

        populateArray(data);

        if (exists(data, lookForValue)) {
            System.out.println(lookForValue + " exists in the array");
        } else {
            System.out.println(lookForValue + " does not exist in the array");
        }
    }

    public static boolean exists(int[] data, int target) {
        boolean found = false;
        int i = 0;

        while (!found && i < data.length) {
            if (data[i] == target) {
                found = true;
            } else {
                i++;
            }
        }

        return found;
    }

    public static void populateArray(int[] data) {
        Random randomNumbers = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = randomNumbers.nextInt(200001);  // generates 0-200,000
        }
    }

}
