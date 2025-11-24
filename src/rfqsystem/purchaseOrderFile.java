
package rfqsystem;
import java.util.*;

//purchase order to upload.

public class purchaseOrderFile {
    
  public static void purchaseOrderAttachment(Parts[] parts, String name, String partModel, int partId, int partQuantity) {

        boolean isFound = false;

        System.out.println("\n------------Attachment Uploaded.------------");
        System.out.println("Searching for part....");
        //----
        for (int i = 0; i < parts.length; i++) {
            Parts p = parts[i];

            if (p == null) {
                continue; // safety in case of null slots
            }

            // Match on name, model, id, and ensure enough quantity
            if (p.partName.equalsIgnoreCase(name) &&
                p.partModel.equalsIgnoreCase(partModel) &&
                p.partId == partId &&
                p.quantity >= partQuantity) {

                isFound = true;

                System.out.println("------------Part Found-----------");
                System.out.println("Part ID:            " + p.partId);
                System.out.println("Name:               " + p.partName);
                System.out.println("Model:              " + p.partModel);
                System.out.println("Supplier:           " + p.Supplier);
                System.out.println("Available Quantity: " + p.quantity);
                System.out.println("Unit Price:         " + p.price);
                System.out.println("Total price for quantity (" + partQuantity + ") = " 
                                   + (p.price * partQuantity));
                System.out.println("---------------------------------");
            }
        }

        if (!isFound) {
            System.out.println("No matching parts are available to display.");
        }
    }
    
    
}
