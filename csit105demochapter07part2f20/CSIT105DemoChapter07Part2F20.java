package csit105demochapter07part2f20;

import javax.swing.JOptionPane;

/**
 * Demos for Ch 7 Part 2
 * @author Stephen T. Brower
 */
public class CSIT105DemoChapter07Part2F20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables
        String messageToDisplay;

        //set messageToDisplay
        messageToDisplay = "To see the programs that accompany Chapter 7 Part 2, expand"
                + " \"CSIT105DemoChapter07Part2F20\" then expand \"Source Packages\" then "
                + "expand \"CSIT105demochapter07part2f20\""
                + "\n\nto run a program, right-click on the program and select \"Run File\"";
        // Display the message.
        JOptionPane.showMessageDialog(null, messageToDisplay);

        // close the JOptionPane thread.
        System.exit(0);

    }
    
}
