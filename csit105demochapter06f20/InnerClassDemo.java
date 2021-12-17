package csit105demochapter06f20;

/**
 * This program demonstrates the RetailItem class, which has an inner class.
 *
 * @author Tony Gaddis (et al)
 */

public class InnerClassDemo {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a RetailItem object.
        RetailItem item = new RetailItem("Candy bar", 17789,
                0.75, 1.5);

        // Display the item's information.
        System.out.println(item);
    }
}
