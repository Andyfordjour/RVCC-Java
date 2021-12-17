package csit105demochapter05f20;


/**
 * This program uses nested loops to simulate a clock.
 *
 * @author Tony Gaddis
 */
public class Clock {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int hours = 1; hours <= 12; hours++) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                for (int seconds = 0; seconds <= 59; seconds++) {
                    System.out.printf("%2d:%2d:%2d\n",hours, minutes, seconds);
                }
            }
        }
    }
}
