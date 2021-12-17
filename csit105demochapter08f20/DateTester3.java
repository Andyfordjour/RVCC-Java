package csit105demochapter08f20;

/**
 * This program demonstrates the DateComponent class.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTester3 {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date dateRaw = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String dateFormatted;
        DateComponent dateParser;  // Create a DateComponent object

        // Create a string containing a date.
        dateFormatted = sdf.format(dateRaw);

        System.out.println("today (raw) = " + dateRaw);
        System.out.println("today (formatted) = " + dateFormatted);

        // initialize with the date.
        dateParser = new DateComponent(dateFormatted);

        // Display the components of the date.
        System.out.println("\nHere's the date: " + dateFormatted);
        System.out.println("The month is " + dateParser.getMonth());
        System.out.println("The day is " + dateParser.getDay());
        System.out.println("The year is " + dateParser.getYear());
    }
}
