package csit105demochapter09f20;

/**
 * Demo of Car as a subclass of Vehicle
 * Date Written:   7/17/2014
 * @author Stephen Brower
 */

public class Car extends Vehicle {

    private int numDoors;

    /**
     * no-arg constructor
     */
    public Car() {
        super("model-t", 1911);
        numDoors = 4;
    }

    /**
     * Constructor
     *
     * @param newMake The value to store in make.
     * @param newYearModel The value to store in yearModel.
     * @param newNumDoors The value to store in numDoors.
     */
    public Car(String newMake, int newYearModel, int newNumDoors) {
        super(newMake, newYearModel);
        numDoors = newNumDoors;
    }

    /**
     * toString method used to return a String representing this Car
     *
     * @return a String representing this Car
     */
    @Override
    public String toString() {
        return "Car: make:" + make
                + " year:" + yearModel
                + " doors: " + numDoors;
    }

    /**
     * The getNumDoors method returns a Car's numDoors
     *
     * @return The value in the numDoors field.
     */
    public int getNumDoors() {
        return numDoors;
    }

    /**
     * The setNumDoors method stores a value in the numDoors field.
     *
     * @param newNumDoors The value to store in numDoors.
     */
    public void setNumDoors(int newNumDoors) {
        numDoors = newNumDoors;
    }

}
