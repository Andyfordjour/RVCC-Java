//andy fordjour
package call.phone.project;

import java.util.Scanner;

/**
 *
 * @author fordj
 */
public class CallPhoneProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaration of variables
        String manufacturer, model;
        double retailPrice;
        // create keyboard scnner input
        Scanner keyboard = new Scanner(System.in);
        // assign variable
        //manufact
        System.out.print("enter manufacturer:");
        manufacturer = keyboard.nextLine();
        // model
        System.out.print("enter phone model:");
        model = keyboard.nextLine();
        // retailPrice
        System.out.print("enter retailPrice:");
        retailPrice = keyboard.nextDouble();
        //instantiate the cellphone class
        CellPhone myPhone = new CellPhone(manufacturer, model, retailPrice);
        // display
        System.out.println("here is the data that you provided ");
        System.out.println("manufacturer:" + myPhone.getManufact());
        System.out.println("phone model " + myPhone.getModel());
        System.out.println("retailPrice $" + myPhone.getRetailPrice());
        
    }

}
