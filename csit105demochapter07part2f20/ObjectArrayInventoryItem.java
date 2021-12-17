package csit105demochapter07part2f20;

/**
 * This program works with an array of ten BankAccount objects.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */

public class ObjectArrayInventoryItem {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int NUM_ITEMS = 5;  // Number of items

        // Create an array that can reference
        // InventoryItem objects.
        InventoryItem[] inventory = new InventoryItem[NUM_ITEMS];

        /* note: at this point inventory[0] is null
                 inventory[0].getUnits() would result in
                 null pointer exception */
 /*   System.out.printf("item %2d: Desc: \"%s\" Units: %d\n",(0 + 1),
                              inventory[0].getDescription(),
                              inventory[0].getUnits());
         */
        // Create objects for the array.
        createInventory(inventory);

        // show objects in the array.
        showInventoryItemArray(inventory);

    }

    /**
     * The createInventory method creates a InventoryItem object for each
     * element of an array - The default is used
     *
     * @param array The array to reference the accounts
     */
    private static void createInventory(InventoryItem[] array) {
        // Create the inventory.
        for (int index = 0; index < array.length; index++) {
            // Create the item.
            array[index] = new InventoryItem();
        }
    }

    /**
     * The showInventoryItemArray method accepts an array of InventoryItem as an
     * argument and displays its
     *
     * @param arraycontents.reference to array to display
     */
    public static void showInventoryItemArray(InventoryItem[] array) {
        // Display the balances of each account.
        System.out.println("Here are the inventory details:");
        // Display the array elements.
        for (int index = 0; index < array.length; index++) {
            System.out.printf("item %2d: Desc: \"%s\" Units: %d\n", (index + 1),
                    array[index].getDescription(),
                    array[index].getUnits());
        }
    }
}
