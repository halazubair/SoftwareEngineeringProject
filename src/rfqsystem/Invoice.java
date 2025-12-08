/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rfqsystem;

/**
 *
 * @author laraw
 */
public class Invoice {
    
    public static void printReceipt(Parts part, int quantity, String airlineCompany, int companyId, String buyerName, int employeeId) {

        double total = part.price * quantity;

        System.out.println("\n--------- ORDER RECEIPT---------");
        System.out.println("Airline Company:   " + airlineCompany);
        System.out.println("Company ID:        " + companyId);
        System.out.println("Buyer Name:        " + buyerName);
        System.out.println("Employee ID:       " + employeeId);
        System.out.println("-----------------------------------");
        System.out.println("Supplier:          " + part.Supplier);
        System.out.println("Part Name:         " + part.partName);
        System.out.println("Part Model:        " + part.partModel);
        System.out.println("Part ID:           " + part.partId);
        System.out.println("Quantity:          " + quantity);
        System.out.println("Unit Price:        " + part.price);
        System.out.println("Total Amount:      " + total);
        System.out.println("Order Status:      FINALIZED");
        System.out.println("-----------------------------------");
    }
    
    
    public static void notFinalizedInvoice(Parts part, int quantity, String airlineCompany, int companyId, String buyerName, int employeeId) {

        double total = part.price * quantity;

         System.out.println("\n--------- ORDER RECEIPT---------");
        System.out.println("Airline Company:   " + airlineCompany);
        System.out.println("Company ID:        " + companyId);
        System.out.println("Buyer Name:        " + buyerName);
        System.out.println("Employee ID:       " + employeeId);
        System.out.println("-----------------------------------");
        System.out.println("Supplier:          " + part.Supplier);
        System.out.println("Part Name:         " + part.partName);
        System.out.println("Part Model:        " + part.partModel);
        System.out.println("Part ID:           " + part.partId);
        System.out.println("Quantity:          " + quantity);
        System.out.println("Unit Price:        " + part.price);
        System.out.println("Total Amount:      " + total);
        System.out.println("Order Status:      NOT FINALIZED");
        System.out.println("-----------------------------------");
    }
    
   
}
