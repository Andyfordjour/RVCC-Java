package csit105demochapter09f20;

/**
 * Demo using Vehicle and subclasses of Vehicle
 * Date Written:   7/17/2014
 * @author Stephen Brower
 */

public class CarTruckVehicleDemo {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle sampleVehicle = new Vehicle("silly", 1972);
        Car sampleCar = new Car("Chevy Corvette", 2014, 2);
        Truck sampleTruck = new Truck("U-Haul Box Truck", 2013, 1611);

        System.out.println(sampleVehicle.getMake());
        System.out.println(sampleCar.getMake() + " "
                + sampleCar.getNumDoors());
        System.out.println(sampleTruck.getMake());
    }
}
