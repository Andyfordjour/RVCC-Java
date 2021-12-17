package csit105demochapter07part3f20;

/**
 * This program displays the arguments passed to
 * it from the operating system command line.
 * Using NetBeans?  Project Properties
 * -f -c huh.txt
 * @author Tony Gaddis (et al)
 */

public class CommandLine {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("no args");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
    }
}
