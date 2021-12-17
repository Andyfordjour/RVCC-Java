package csit105demochapter03f20;

import javax.swing.JOptionPane;

/**
 * Demo files for Chapter 3.
 * @author Stephen T. Brower
 */
public class CSIT105DemoChapter03F20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables
        String messageToDisplay;

        //set messageToDisplay
        messageToDisplay = "To see the programs that accompany Chapter 3, expand"
                            + " \"CISY105DemoChapter03F20\" then expand \"Source "
                            + "Packages\" then expand \"cisy105demochapter03f20\""
                            + "\n\nto run a program, right-click on the program "
                            +"and select \"Run File\"";
        // Display the message.
        JOptionPane.showMessageDialog(null, messageToDisplay);

        // close the JOptionPane thread.
        System.exit(0); 
        
    }
    
}
