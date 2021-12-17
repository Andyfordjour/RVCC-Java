package csit105demochapter05f20;

/**
 * This program demonstrates the ++ and -- operators
 * in prefix mode.
 * @author Tony Gaddis 
 */

public class Prefix
{
    /**
     * The main method is the program's starting point.
     * @param args the command line arguments
     */
   public static void main(String[] args)
   {
      int number = 4;

      // Display the value in number.
      System.out.println("number is " + number);
      System.out.println("\nI will increment number.");

      // Increment number.
      ++number;

      // Display the value in number.
      System.out.println("Now, number is " + number);
      System.out.println("\nI will decrement number.");

      // Decrement number.
      --number;

      // Display the value in number.
      System.out.println("\nNow, number is " + number);
   }
}
