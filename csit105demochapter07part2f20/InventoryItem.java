package csit105demochapter07part2f20;

/**
 * This class uses three constructors.
 *
 * @author Tony Gaddis (et al)
 */

public class InventoryItem {

    private String description;  // Item description
    private int units;           // Units on-hand

    /**
     * No-arg constructor
     */
    public InventoryItem() {
        description = "";
        units = 0;
    }

    /**
     * The following constructor accepts a String argument which is assigned to
     * the description field.
     *
     * @param d value for description field
     */
    public InventoryItem(String d) {
        description = d;
        units = 0;
    }

    /**
     * The following constructor accepts a String argument which is assigned to
     * the description field, and an int argument which is assigned to the units
     * field.
     *
     * @param d value for description field
     * @param u value for units field
     */
    public InventoryItem(String d, int u) {
        description = d;
        units = u;
    }

    /**
     * The setDescription method assigns its argument to the description field.
     *
     * @param d value for description field
     */
    public void setDescription(String d) {
        description = d;
    }

    /**
     * The setUnits method assigns its argument to the units field.
     *
     * @param u value for units field
     */
    public void setUnits(int u) {
        units = u;
    }

    /**
     * The getDescription method returns the value in the description field.
     *
     * @return value from description field
     */
    public String getDescription() {
        return description;
    }

    /**
     * The getUnits method returns the value in the units field.
     *
     * @return value from description field
     */
    public int getUnits() {
        return units;
    }
}
