/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package call.phone.project;

/**
 *
 * @author fordj
 */
public class CellPhone {
    private String manufact;
    private String model;
    private  double retailPrice;
/**
 * 
 * @param man value for the manufact 
 * @param mod value for the model
 * @param price for the retailPrice  
 */
    public CellPhone(String man, String mod, double price) {
        manufact = man;
        model = mod;
        retailPrice = price;
        //
        
        
    }

    public String getManufact() {
        return manufact;
    }

    public void setManufact(String man) {
        manufact = man;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String mod) {
        model = mod;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double price) {
        retailPrice = price;
    }

       
}
