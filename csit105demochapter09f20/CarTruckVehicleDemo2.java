package csit105demochapter09f20;

/**
 * Demo using Vehicle and subclasses of Vehicle
 * Date Written:   7/17/2014
 * @author Stephen Brower
 */

public class CarTruckVehicleDemo2 {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Polymorphism:
        Vehicle sampleVehicle1 = new Vehicle("silly", 1972);
        Vehicle sampleVehicle2 = new Car("Chevy Corvette", 2014, 2);
        Vehicle sampleVehicle3 = new Truck("U-Haul Box Truck", 2013, 1611);

        System.out.println("sampleVehicle1: " + sampleVehicle1);
        System.out.println("sampleVehicle2: " + sampleVehicle2);
        System.out.println("sampleVehicle3: " + sampleVehicle3);

        if (sampleVehicle2 instanceof Car) {
            System.out.println("\n'sampleVehicle2' is a Car - doors "
                    + ((Car) sampleVehicle2).getNumDoors());
        } else if (sampleVehicle2 instanceof Truck) {
            System.out.println("\n'sampleVehicle2' is a Truck - cu ft "
                    + ((Truck) sampleVehicle2).getCubicFeetStorage());
        } else {
            System.out.println("\n'sampleVehicle2' is neither a Car nor a Truck");
        }

        if (sampleVehicle1 instanceof Car) {
            System.out.println("\n'sampleVehicle1' is a Car - doors "
                    + ((Car) sampleVehicle1).getNumDoors());
        } else if (sampleVehicle1 instanceof Truck) {
            System.out.println("\n'sampleVehicle1' is a Truck - cu ft "
                    + ((Truck) sampleVehicle1).getCubicFeetStorage());
        } else {
            System.out.println("\n'sampleVehicle1' is neither a Car nor a Truck");
        }

        if (sampleVehicle3 instanceof Car) {
            System.out.println("\n'sampleVehicle3' is a Car - doors "
                    + ((Car) sampleVehicle3).getNumDoors());
        } else if (sampleVehicle3 instanceof Truck) {
            System.out.println("\n'sampleVehicle3' is a Truck - cu ft "
                    + ((Truck) sampleVehicle3).getCubicFeetStorage());
        } else {
            System.out.println("\n'sampleVehicle3' is neither a Car nor a Truck");
        }
    }
}
