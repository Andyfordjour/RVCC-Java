package csit105demochapter07part3f20;

import java.util.ArrayList; // Needed for ArrayList class

/**
 * This program demonstrates an ArrayList.
 *
 * @author Tony Gaddis (et al)
 */
public class ArrayListDemo3B {

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

        // Now remove the item named Catherine
        nameList.remove("Catherine");

        System.out.println("The item \"Catherine\" is removed. "
                + "Here are the items now.");

        // Display the items in nameList and their indices.
        for (int index = 0; index < nameList.size(); index++) {
            System.out.println("Index: " + index + " Name: "
                    + nameList.get(index));
        }
    }
}
