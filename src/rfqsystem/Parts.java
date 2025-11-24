
package rfqsystem;

import java.util.logging.Logger;
import java.util.*;

public class Parts {
    
    
    String partName;
    String partModel;
    int partId;
    int quantity;
    double price;
    String Supplier;

    // Constructor
    public Parts(String partName, String partModel, int partId,
                 int quantity, double price, String Supplier) {

        this.partName = partName;
        this.partModel = partModel;
        this.partId = partId;
        this.quantity = quantity;
        this.price = price;
        this.Supplier = Supplier;
    }


    public static void addPart(Parts[] parts, Scanner i) {

        int index = -1;

        // Find empty position in array
        for (int j = 0; j < parts.length; j++) {
            if (parts[j] == null) {
                index = j;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Cannot add more parts. The list is full.");
            return;
        }

        System.out.println("---------Add Your New Part---------");

        System.out.print("Enter Part Name: ");
        String name = i.next();

        System.out.print("Enter  Part Model: ");
        String model = i.next();

        System.out.print("Enter Part ID: ");
        int id = i.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = i.nextInt();

        System.out.print("Enter Price: ");
        double price = i.nextDouble();

        System.out.print("Enter Supplier Name (Your Name): ");
        String supplier = i.next();

        // Add to array
        parts[index] = new Parts(name, model, id, quantity, price, supplier);
        double total = price * quantity;

        System.out.println("Part has been added successfully.");
        System.out.println("-------- Added Part Details --------");
        System.out.println("Part Name: " + parts[index].partName);
        System.out.println("Part Model Code:  "+ parts[index].partModel);
        System.out.println("Part ID: " + parts[index].partId);
        System.out.println("Quantity: " + parts[index].quantity);
        System.out.println("Price : " + total);
        System.out.println("Supplier Name: " + parts[index].Supplier);
        System.out.println("------------------------------------");
    }
 
}
