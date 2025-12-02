
package rfqsystem;

import java.util.Scanner;

public class Supplier {
    
    public static boolean showSupplierParts(Parts[] parts, Scanner i) {

        System.out.println("------------Supplier Information------------");

        System.out.print("Enter your Name: ");

        // clear 
        i.nextLine();
        String supplierName = i.nextLine(); //Supplier enters his name.

        boolean found = false;

        System.out.println("\nListing all parts of supplier: " + supplierName + "\n");

        for (int x = 0; x < parts.length; x++) {
            Parts p = parts[x];

            if (p == null) {
                continue;
            }

            if (p.Supplier.equalsIgnoreCase(supplierName)) {
                found = true;

                System.out.println("------------ Part Information -----------");
                System.out.println("Part ID:            " + p.partId);
                System.out.println("Name:               " + p.partName);
                System.out.println("Model:              " + p.partModel);
                System.out.println("Available Quantity: " + p.quantity);
                System.out.println("Unit Price:         " + p.price);
                System.out.println("---------------------------------");
                System.out.println();
            }
        }

        if (!found) {
            System.out.println("No parts found for supplier: " + supplierName);
        }
        return found;
    }
    //testt

}
