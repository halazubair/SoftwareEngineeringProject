package rfqsystem;

import java.util.*;

public class RfqSystem {

    public static void main(String[] args) {  
        Scanner i = new Scanner(System.in);

        //---------------------------Part Array---------------------------------
    
        Parts[] parts = new Parts[50];
        parts[0] = new Parts("Bearing", "B100", 21122, 50, 2000,   "Supplier A");
        parts[1] = new Parts("Bearing", "B100", 21122, 50, 1500,   "Supplier B");
        parts[2] = new Parts("Belt",    "BL9",  61200, 300, 1640, "Supplier A");
        parts[3] = new Parts("Filter",  "F300", 15583, 100, 1007, "Supplier B");
        parts[4] = new Parts("Bearing", "B100", 21122, 50,  990,  "Supplier D");
        parts[5] = new Parts("Filter",  "F300", 15583, 110, 1260, "Supplier C");
        parts[6] = new Parts("Bearing", "B100", 21122, 50,  1100,  "Supplier F");
        parts[7] = new Parts("Belt",    "BL9",  61200, 300, 1450, "Supplier B");
        parts[8] = new Parts("Filter",  "F300", 15583, 50,  1200,  "Supplier E");
        parts[9] = new Parts("Filter",  "F300", 15583, 50,  7.0,  "Supplier P");
        parts[10] = new Parts("Bearing", "B100", 21122, 50,  1200,  "Supplier E");
        parts[11] = new Parts("Bearing", "B100", 21122, 50,  1939,  "Supplier H");
        parts[12] = new Parts("TurbineBlade", "TBX90", 99999,  2, 8000, "Supplier X"); 
        parts[13] = new Parts("TurbineBlade", "TBX90", 99999,  2, 8500, "Supplier L"); 
        parts[14] = new Parts("FuelControlUnit", "HLX44", 44444, 1, 15000, "Supplier Z"); 
        parts[15] = new Parts("FuelControlUnit", "HLX44", 44444, 1, 14200, "Supplier N");
        


        System.out.println("-------Welcome to the RFQ System!-------");
        System.out.println("--------Please choose your role:-------");
        System.out.println("1. Buyer");
        System.out.println("2. Supplier");

        int choice = 0;

        //-----------------Role Based-------------------- 
        while (true) {
            System.out.print("Enter your choice: ");
            choice = i.nextInt();

            if (choice == 1) {
                System.out.println("Role: Buyer has been selected!");
                break;
            } else {
                System.out.println("Role: Supplier has been selected!");
                break;
            } 
        }

        //-----------------------Choice 1=Buyer---------------------- 
        if (choice == 1) {
            System.out.println("------------Upload part information-----------");

            System.out.print("Enter Part Name: ");     // ex Bearing
            String name = i.next();

            System.out.print("Enter Part Model Code: ");    // ex B100
            String partModel = i.next();

            System.out.print("Enter Part Id: ");       // ex 21122
            int partId = i.nextInt();

            System.out.print("Enter the Desired Quantity: ");
            int partQuantity = i.nextInt();

            
             
         //---------------------------Rare Part AUCTION---------------------------------
    boolean rare = isRarePart(name, partModel, partId);

    if (rare) {
        
        System.out.println("\n This is a Rare Part. Auction time: 30 seconds.");
        Auction.startAuctionTimer();   

        purchaseOrderFile.purchaseOrderAttachment(parts, name, partModel, partId, partQuantity);
        //time has finished
        if (!Auction.auctionOpen) {
            System.out.println("Auction ended before you could choose a supplier. No order placed.");
        } else {
            //if time did not finish,display part.
            Parts chosenPart = chooseSupplier(parts, name, partModel, partId, partQuantity, i);
            //if the user did not choose the supplier he wants to finish the deal with and time has finished display.
            if (!Auction.auctionOpen) {
                System.out.println("Auction ended before confirmation. No order placed.");
            } else {
                //else if he did choose the supplier finalize the order and printorder information.
                finalizeOrder(chosenPart, partQuantity, i);
            }
        }
    
    } else {
        purchaseOrderFile.purchaseOrderAttachment(parts, name, partModel, partId, partQuantity);  
        Parts chosenPart = chooseSupplier(parts, name, partModel, partId, partQuantity, i);
        finalizeOrder(chosenPart, partQuantity, i);
    }
    //----------------------choice 2=Supplier----------------------------
        } else {
            System.out.println("-----------Choose your action----------- ");
            System.out.println("1.Display My Parts");
            System.out.println("2.Add Parts");
            System.out.print("Enter Action: ");
            int action=i.nextInt();
            if(action==1){
                Supplier s=new Supplier();
                s.showSupplierParts(parts, i);
            }else if(action==2){
                    Parts.addPart(parts, i);
            }else{
                System.out.println("Action not Available.");
            }
           }

        i.close();
    }
//-----------------------------------------Methods-------------------------------------------

    public static Parts chooseSupplier(Parts[] parts,String name,String partModel,int partId,int partQuantity,Scanner i){

    System.out.print("\nPlease enter the name of the supplier you prefer to buy from: ");

    // Clear the leftover newline from previous nextInt()
    i.nextLine();

    String chosenSupplier = i.nextLine();

    boolean supplierFound = false;

    System.out.println("\nSearching for the part with supplier: " + chosenSupplier + " ...");

    for (int x = 0; x < parts.length; x++) {
        Parts p = parts[x];

        if (p == null) {
            continue;
        }

        // Same part info + chosen supplier
        if (p.partName.equalsIgnoreCase(name) &&
            p.partModel.equalsIgnoreCase(partModel) &&
            p.partId == partId &&
            p.quantity >= partQuantity &&
            p.Supplier.equalsIgnoreCase(chosenSupplier)) {

            supplierFound = true;

            System.out.println("------------Chosen Part-----------");
            System.out.println("Part ID:            " + p.partId);
            System.out.println("Name:               " + p.partName);
            System.out.println("Model:              " + p.partModel);
            System.out.println("Supplier:           " + p.Supplier);
            System.out.println("Available Quantity: " + p.quantity);
            System.out.println("Unit Price:         " + p.price);
            System.out.println("Total price for quantity (" + partQuantity + ") = "
                               + (p.price * partQuantity));
            System.out.println("-------------------------------------");
            return p;
        }
    }

    if (!supplierFound) {
        System.out.println("No matching part found for supplier: " + chosenSupplier);
    }
        return null;
}
//------------------------------------------------------------------------------------
   public static boolean finalizeOrder(Parts chosen, int partQuantity, Scanner i) {
    if (chosen == null) {
        System.out.println("\nCannot finalize order because no valid choice was selected.");
        return false;
    }

    System.out.print("\nWant to finalize this order? (Y/N): ");
    String confirm = i.next();

    if (confirm.equalsIgnoreCase("Y")) {

        
        Notification.sendNotification(
            "New order confirmed for supplier " + chosen.Supplier + " , Part Name: " + chosen.partName + 
                    "( " + chosen.partModel + ")" +" , Quantity: " + partQuantity
        );

       
        Invoice.printReceipt(chosen, partQuantity);
        return true;
        
    } else {
        System.out.println("Order not finalized.");
        Invoice.notFinalizedInvoice(chosen, partQuantity);
        return false;
    }
}
//------------------------------------------------------------------------------------
   public static boolean isRarePart(String name, String partModel, int partId) {
    
    if (partModel.equalsIgnoreCase("TBX90") && name.equalsIgnoreCase("TurbineBlade")) {
        return true;
    }
     if (partModel.equalsIgnoreCase("HLX44") && name.equalsIgnoreCase("FuelControlUnit")) {
        return true;
    }
    return false;
}
//---------------------------------------------------------------------------------------
   
}
