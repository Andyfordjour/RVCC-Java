package csit105demochapter06f20;

/**
 * This program demos overloaded constructor
 * Date written:    10/12/2011
 * @author Stephen Brower
 */

public class CarDemo2
{
    /**
     * The main method is the program's starting point.
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Car myCar1 = new Car(2020,"Porsche");
        Car myCar2 = new Car();

        System.out.println("Currently, car 1 is " +
                                "["+ myCar1.getYearModel() + ", " + myCar1.getMake() + "] " +
                                "\nand car 2 is " +
                                "["+ myCar2.getYearModel() + ", " + myCar2.getMake() + "]");


        myCar2.setMake("Toyota Prius");
        myCar2.setYearModel(2020);

        System.out.println("\nAnd now... car 1 is " +
                                "["+ myCar1.getYearModel() + ", " + myCar1.getMake() + "] " +
                                "\nand car 2 is " +
                                "["+ myCar2.getYearModel() + ", " + myCar2.getMake() + "]");

    }
}