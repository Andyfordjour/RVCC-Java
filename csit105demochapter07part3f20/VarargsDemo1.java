package csit105demochapter07part3f20;

/**
 * This program demonstrates a method that accepts a variable number of
 * arguments (varargs).
 *
 * @author Tony Gaddis (et al)
 */
public class VarargsDemo1 {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result;  // To hold a result

        // Call the method with two arguments.
        result = sum(10, 20);
        System.out.println(result);

        // Call the method with four arguments.
        result = sum(10, 20, 30, 40);
        System.out.println(result);

        // Call the method with six arguments.
        result = sum(10, 20, 30, 40, 50, 60);
        System.out.println(result);
    }

    /**
     * The sum method takes a variable number of int arguments and returns their
     * sum.
     */
    public static int sum(int... numbers) {
        int total = 0;  // Accumulator
        
        System.out.println("L: " + numbers.length);

        // Add all the values in the numbers array.
        for (int i = 0; i < numbers.length; i++) {
            total+= numbers[i];
            
        }
 

        // Return the total.
        return total;
    }
}
