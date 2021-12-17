package csit105demochapter07part3f20;

import java.util.ArrayList; // Needed for ArrayList class

/**
 * This program demonstrates an ArrayList.
 *
 * @author Tony Gaddis (et al)
 */
public class ArrayListDemo1 {

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

        // Display the size of the ArrayList.
        System.out.println("The ArrayList has "
                + nameList.size()
                + " objects stored in it.");

        // Now display the items in nameList.
        for (int index = 0; index < nameList.size(); index++) {
            System.out.println(nameList.get(index));
        }
    }
}
