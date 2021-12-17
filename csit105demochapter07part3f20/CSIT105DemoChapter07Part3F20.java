package csit105demochapter07part3f20;

import javax.swing.JOptionPane;

/**
 * Demos for Chapter 7 - part 3, the exciting conclusion!
 * @author Stephen T. Brower
 */
public class CSIT105DemoChapter07Part3F20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables
        String messageToDisplay;

        //set messageToDisplay
        messageToDisplay = "To see the programs that accompany Chapter 7 Part 3, expand"
                + " \"CSIT105DemoChapter07Part3F20\" then expand \"Source Packages\" then "
                + "expand \"CSIT105demochapter07part3f20\""
                + "\n\nto run a program, right-click on the program and select \"Run File\"";
        // Display the message.
        JOptionPane.showMessageDialog(null, messageToDisplay);

        // close the JOptionPane thread.
        System.exit(0);
    }
    
}
