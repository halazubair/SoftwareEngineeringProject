
package rfqsystem;

import java.util.logging.Logger;

public class Parts {

    String partName;
    String partModel;
    int partId;
    int quantity;
    double price;
    String Supplier; 
    
    public Parts(String partName, String partModel, int partId, int quantity, double price, String Supplier) {
        this.partName = partName;
        this.partModel = partModel;
        this.partId = partId;
        this.quantity = quantity;
        this.price = price;
        this.Supplier = Supplier;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public void setPartModel(String partModel) {
        this.partModel = partModel;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    public String getPartName() {
        return partName;
    }

    public String getPartModel() {
        return partModel;
    }

    public int getPartId() {
        return partId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getSupplier() {
        return Supplier;
    }

 
   

    
    
}
