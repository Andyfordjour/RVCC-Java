package csit105demochapter08f20;

/**
 * This program demonstrates the DateComponent class.
 *
 * @author Tony Gaddis (et al)
 */
public class DateTester {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a string containing a date.
        String date = "10/23/2007";

        // Create a DateComponent object, initialized
        // with the date.
        DateComponent dc = new DateComponent(date);

        // Display the components of the date.
        System.out.println("Here's the date: " + date);
        System.out.println("The month is " + dc.getMonth());
        System.out.println("The day is " + dc.getDay());
        System.out.println("The year is " + dc.getYear());
    }
}
