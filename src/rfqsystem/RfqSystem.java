package rfqsystem;

import java.util.*;

public class RfqSystem {

    public static void main(String[] args) {  
        Scanner i = new Scanner(System.in);

        // parts database
        Parts[] parts = new Parts[10];
        parts[0] = new Parts("Bearing", "B100", 21122, 50, 2000,   "Supplier A");
        parts[1] = new Parts("Bearing", "B100", 21122, 50, 1500,   "Supplier B");
        parts[2] = new Parts("Belt",    "BL9",  61203, 300, 12.0, "Supplier A");
        parts[3] = new Parts("Filter",  "F300", 15583, 100, 8.75, "Supplier C");
        parts[4] = new Parts("Bearing", "B100", 21122, 50,  990,  "Supplier D");
        parts[5] = new Parts("Filter",  "F300", 15086, 120, 8.75, "Supplier C");
        parts[6] = new Parts("Bearing", "B100", 21122, 50,  1100,  "Supplier F");
        parts[7] = new Parts("Belt",    "BL9",  90000, 250, 12.0, "Supplier A");
        parts[8] = new Parts("Filter",  "F300", 14370, 60,  7.0,  "Supplier E");
        parts[9] = new Parts("Bearing", "B100", 21122, 50,  1200,  "Supplier D");

        System.out.println("-------Welcome to the RFQ System!-------");
        System.out.println("--------Please choose your role:-------");
        System.out.println("1. Buyer");
        System.out.println("2. Supplier");

        int choice = 0;

        //1st Core Function-> choose role 
        while (true) {
            System.out.print("Enter your choice: ");
            choice = i.nextInt();

            if (choice == 1) {
                System.out.println("Buyer has been selected!");
                break;
            } else if (choice == 2) {
                System.out.println("Supplier has been selected!");
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid role (1 = Buyer, 2 = Supplier).");
            }
        }

        //2nd Core Function -> Buyer enters part info 
        if (choice == 1) {
            System.out.println("------------Enter part information-----------");

            System.out.print("Enter Part Name: ");     // e.g. Bearing, Belt, Filter
            String name = i.next();

            System.out.print("Enter Part Model: ");    // e.g. B100, BL9, F300
            String partModel = i.next();

            System.out.print("Enter Part Id: ");       // e.g. 21122, 50000
            int partId = i.nextInt();

            System.out.print("Enter the desired Quantity: ");
            int partQuantity = i.nextInt();

            searchPart(parts, name, partModel, partId, partQuantity);
        } else {
            System.out.println("Supplier functionality not implemented yet.");
        }

        i.close();
    }
    public static void searchPart(Parts[] parts, String name, String partModel, int partId, int partQuantity) {

        boolean isFound = false;

        System.out.println("\nSearching for part....");

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
