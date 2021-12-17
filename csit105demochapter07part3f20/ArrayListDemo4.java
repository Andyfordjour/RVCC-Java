package csit105demochapter07part3f20;

import java.util.ArrayList; // Needed for ArrayList class

/**
 * This program demonstrates inserting an item.
 *
 * @author Tony Gaddis (et al)
 */
public class ArrayListDemo4 {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an ArrayList to hold some names.
        ArrayList<String> nameList = new ArrayList<String>();

        // Add some names to the ArrayList.
        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");

        // Display the items in nameList and their indices.
        for (int index = 0; index < nameList.size(); index++) {
            System.out.println("Index: " + index + " Name: "
                    + nameList.get(index));
        }

        // Now insert an  item at index 1.
        nameList.add(1, "Mary");

        System.out.println("\nMary was added at index 1. "
                + "Here are the items now.");

        // Display the items in nameList and their indices.
        for (int index = 0; index < nameList.size(); index++) {
            System.out.println("Index: " + index + " Name: "
                    + nameList.get(index));
        }

        // Now make Bill, William of Whitehouse Station
        nameList.set(3, "William of Whitehouse Station");

        System.out.println("\nBill is now William of Whitehouse Station");

        // Display the items in nameList and their indices.
        for (int index = 0; index < nameList.size(); index++) {
            System.out.println("Index: " + index + " Name: "
                    + nameList.get(index));
        }

    }
}
