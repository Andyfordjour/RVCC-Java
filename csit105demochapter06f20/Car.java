package csit105demochapter06f20;
/** 
 * Car class demo
 * Date written     9/22/2011
 * Date Modified    10/12/2011 - added no-arg constructor,
 *                               toString(), equals()
 *                  6/25/2014 - added Javadoc comments
* @author Stephen Brower
*/
public class Car {

    private int yearModel;
    private String make;
    private int speed;

    /**
     * Constructor
     *
     * @param newYear value to go to yearModel field
     * @param newMake value to go to make field
     */
    public Car(int newYear, String newMake) {
        yearModel = newYear;
        make = newMake;
        speed = 0;
    }

    /**
     * No-arg constructor
     */
    public Car() {
        yearModel = 1908;
        make = "Model-T";
        speed = 0;
    }

    /**
     * getYearModel method returns value for yearModel field
     *
     * @return value in yearModel field
     */
    public int getYearModel() {
        return yearModel;
    }

    /**
     * getMake method returns value for make field
     *
     * @return value in make field
     */
    public String getMake() {
        return make;
    }

    /**
     * getSpeed method returns value for speed field
     *
     * @return value in speed field
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * setYearModel method sets value for yearModel field
     *
     * @param newYearModel value to go to yearModel field
     */
    public void setYearModel(int newYearModel) {
        yearModel = newYearModel;
    }

    /**
     * setMake method sets value for make field
     *
     * @param newMake value to go to make field
     */
    public void setMake(String newMake) {
        make = newMake;
    }

    /**
     * accelerate method increases speed field by 5
     */
    public void accelerate() {
        speed += 5;
        if (speed > 200) {
            speed = 200;
        }
    }

    /**
     * brake method decreases speed field by 5
     */
    public void brake() {
        speed -= 5;
        if (speed < 0) {
            speed = 0;
        }
    }

    /**
     * equals method used to compare this instance of Car to another Car
     *
     * @param otherCar another instance of Car to compare to
     * @return boolean with result of comparison
     */
    public boolean equals(Car otherCar) {
        boolean isSame;

        if (make.equalsIgnoreCase(otherCar.getMake())
                && yearModel == otherCar.getYearModel()) {
            isSame = true;
        } else {
            isSame = false;
        }

        return isSame;
    }

    /**
     * toString method used to return a String representing this Car
     *
     * @return a String representing this Car
     * @Override toString()
     */
    public String toString() {
        String stringToReturn;

        stringToReturn = "Year = " + yearModel + "\n"
                + "Make = " + make + "\n"
                + "Speed = " + speed;
        return stringToReturn;
    }
}
