package csit105demochapter06f20;

/**
 * This program demonstrates toString() in Car
 * Date written:    10/12/2011
 * @author Stephen Brower
 */
public class CarDemo3
{
    /**
     * The main method is the program's starting point.
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // declare variables
        Car someCar = new Car(2011,"Chevy Volt");

        System.out.println(someCar);
    }
}