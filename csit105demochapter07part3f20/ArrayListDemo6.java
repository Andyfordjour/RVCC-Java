package csit105demochapter07part3f20;

import java.util.ArrayList;   // Needed for the ArrayList class

/**
 * This program demonstrates how to use a cast operator with the ArrayList
 * class's get method.
 *
 * @author Tony Gaddis (et al)
 */
public class ArrayListDemo6 {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a listor to hold InventoryItem objects.
        ArrayList<InventoryItem> list = new ArrayList<InventoryItem>();

        // Add three InventoryItem objects to the ArrayList.
        list.add(new InventoryItem("Nuts", 100));
        list.add(new InventoryItem("Bolts", 150));
        list.add(new InventoryItem("Washers", 75));

        // Display each item.
        for (int index = 0; index < list.size(); index++) {
            InventoryItem item = (InventoryItem) list.get(index);
            System.out.println("\nItem at index " + index
                    + "\nDescription: " + item.getDescription()
                    + "\nUnits: " + item.getUnits());
        }
    }
}
