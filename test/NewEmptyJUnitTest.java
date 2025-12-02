
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import rfqsystem.Parts;
import rfqsystem.RfqSystem;
import rfqsystem.Supplier;


public class NewEmptyJUnitTest {
    
     //-------------------Test 1-----------------------

    @Test 
public void testFinalizeOrder_ConfirmYes() {
    Parts chosen = new Parts("Bearing", "B100", 21122, 50, 2000, "SupplierA");
    Scanner input = new Scanner("Y");

    boolean expectedResult = true;
    boolean actualResult = RfqSystem.finalizeOrder(chosen, 50, input);

    assertEquals(expectedResult, actualResult);
}

@Test 
public void testFinalizeOrder_ConfirmNo() {
    Parts chosen = new Parts("Bearing", "B100", 21122, 50, 2000, "SupplierA");
    Scanner input = new Scanner("N");

    boolean expectedResult = false;
    boolean actualResult = RfqSystem.finalizeOrder(chosen, 50, input);

    assertEquals(expectedResult, actualResult);
}

@Test 
public void testFinalizeOrder_NullChosen() {
    Scanner input = new Scanner("Y");

    boolean expectedResult = false;
    boolean actualResult = RfqSystem.finalizeOrder(null, 50, input);

    assertEquals(expectedResult, actualResult);
}

//-------------------Test 2-----------------------

//finds Supplier A
@Test
public void testChooseSupplier_FindsSupplierA() {
    Parts[] parts = new Parts[5];
    parts[0] = new Parts("Bearing", "B100", 21122, 50, 2000, "Supplier A");
    parts[1] = new Parts("Bearing", "B100", 21122, 50, 1500, "Supplier B");

    String name = "Bearing";
    String model = "B100";
    int partId = 21122;
    int quantity = 50;

    Scanner input = new Scanner("\nSupplier A\n");

    boolean expectedResult = true;
    boolean actualResult = (RfqSystem.chooseSupplier(parts, name, model, partId, quantity, input) != null);

    assertEquals(expectedResult, actualResult);
}

//null
@Test
public void testChooseSupplier_SupplierNotFound() {
    Parts[] parts = new Parts[5];
    parts[0] = new Parts("Bearing", "B100", 21122, 50, 2000, "Supplier A");
    parts[1] = new Parts("Bearing", "B100", 21122, 50, 1500, "Supplier B");

    String name = "Bearing";
    String model = "B100";
    int partId = 21122;
    int quantity = 50;

    Scanner input = new Scanner("\nSupplier X\n");

    boolean expectedResult = false;
    boolean actualResult = (RfqSystem.chooseSupplier(parts, name, model, partId, quantity, input) != null);

    assertEquals(expectedResult, actualResult);
}

@Test
public void testChooseSupplier_FindsSupplierB() {
    Parts[] parts = new Parts[5];
    parts[0] = new Parts("Bearing", "B100", 21122, 50, 2000, "Supplier A");
    parts[1] = new Parts("Bearing", "B100", 21122, 50, 1500, "Supplier B");

    String name = "Bearing";
    String model = "B100";
    int partId = 21122;
    int quantity = 50;

    Scanner input = new Scanner("\nSupplier B\n");

    boolean expectedResult = true;
    boolean actualResult = (RfqSystem.chooseSupplier(parts, name, model, partId, quantity, input) != null);

    assertEquals(expectedResult, actualResult);
}


@Test
public void testChooseSupplier_FindsSupplier() {
    Parts[] parts = new Parts[5];
    parts[0] = new Parts("Bearing", "B100", 21122, 50, 2000, "Supplier A");
    parts[1] = new Parts("Bearing", "B100", 21122, 50, 1500, "Supplier B");

    String name = "Bearing";
    String model = "B100";
    int partId = 21122;
    int quantity = 50;

    Scanner input = new Scanner("\nSupplier A\n");

    boolean expectedResult = true;
    boolean actualResult = (RfqSystem.chooseSupplier(parts, name, model, partId, quantity, input) != null);

    assertEquals(expectedResult, actualResult);
}


//Test – chooseSupplier finds Belt from Supplier B
@Test
public void testChooseSupplier_Belt_SupplierA() {
    Parts[] parts = new Parts[3];
    parts[0] = new Parts("Belt", "BL9", 61200, 300, 1640, "Supplier A");
    parts[1] = new Parts("Belt", "BL9", 61200, 300, 1450, "Supplier B");
    parts[2] = null;

    String name = "Belt";
    String model = "BL9";
    int partId = 61200;
    int quantity = 300;

    Scanner input = new Scanner("\nSupplier A\n");

    boolean expectedResult = true;
    boolean actualResult =
        (RfqSystem.chooseSupplier(parts, name, model, partId, quantity, input) != null);

    assertEquals(expectedResult, actualResult);
}


//Test – chooseSupplier finds Belt from Supplier B
@Test
public void testChooseSupplier_Belt_SupplierB() {
    Parts[] parts = new Parts[3];
    parts[0] = new Parts("Belt", "BL9", 61200, 300, 1640, "Supplier A");
    parts[1] = new Parts("Belt", "BL9", 61200, 300, 1450, "Supplier B");
    parts[2] = null;

    String name = "Belt";
    String model = "BL9";
    int partId = 61200;
    int quantity = 300;

    Scanner input = new Scanner("\nSupplier B\n");

    boolean expectedResult = true;
    boolean actualResult =
        (RfqSystem.chooseSupplier(parts, name, model, partId, quantity, input) != null);

    assertEquals(expectedResult, actualResult);
}

@Test
public void testChooseSupplier_Belt_NotFound() {
    Parts[] parts = new Parts[3];
    parts[0] = new Parts("Belt", "BL9", 61200, 300, 1640, "Supplier A");
    parts[1] = new Parts("Belt", "BL9", 61200, 300, 1450, "Supplier B");
    parts[2] = null;

    String name = "Belt";
    String model = "BL9";
    int partId = 61200;
    int quantity = 300;  // want more than available

    Scanner input = new Scanner("\nSupplier X\n");

    boolean expectedResult = false;
    boolean actualResult =
        (RfqSystem.chooseSupplier(parts, name, model, partId, quantity, input) != null);

    assertEquals(expectedResult, actualResult);
}

//Test – chooseSupplier returns null when quantity is too high
@Test
public void testChooseSupplier_Belt_NotEnoughtQuantity() {
    Parts[] parts = new Parts[2];
    parts[0] = new Parts("Belt", "BL9", 61200, 300, 1640, "Supplier A");
    parts[1] = null;

    String name = "Belt";
    String model = "BL9";
    int partId = 61200;
    int quantity = 200;  // want more than available

    Scanner input = new Scanner("\nSupplier A\n");

    boolean expectedResult = true;
    boolean actualResult =
        (RfqSystem.chooseSupplier(parts, name, model, partId, quantity, input) != null);

    assertEquals(expectedResult, actualResult);
}

//Test – chooseSupplier finds Filter from Supplier B
@Test
public void testChooseSupplier_Filter_SupplierB() {
    Parts[] parts = new Parts[3];
    parts[0] = new Parts("Filter", "F300", 15583, 100, 1007, "Supplier B");
    parts[1] = new Parts("Filter", "F300", 15583, 110, 1260, "Supplier C");
    parts[2] = null;

    String name = "Filter";
    String model = "F300";
    int partId = 15583;
    int quantity = 100;   // less than available quantity

    Scanner input = new Scanner("\nSupplier B\n");

    boolean expectedResult = true;
    boolean actualResult =
        (RfqSystem.chooseSupplier(parts, name, model, partId, quantity, input) != null);

    assertEquals(expectedResult, actualResult);
}

//Test – chooseSupplier finds Filter from Supplier C
@Test
public void testChooseSupplier_Filter_SupplierC() {
    Parts[] parts = new Parts[3];
    parts[0] = new Parts("Filter", "F300", 15583, 100, 1007, "Supplier B");
    parts[1] = new Parts("Filter", "F300", 15583, 110, 1260, "Supplier C");
    parts[2] = null;

    String name = "Filter";
    String model = "F300";
    int partId = 15583;
    int quantity = 110;

    Scanner input = new Scanner("\nSupplier C\n");

    boolean expectedResult = true;
    boolean actualResult =
        (RfqSystem.chooseSupplier(parts, name, model, partId, quantity, input) != null);

    assertEquals(expectedResult, actualResult);
}

//Test – chooseSupplier finds Filter from Supplier P
@Test
public void testChooseSupplier_Filter_SupplierP() {
    Parts[] parts = new Parts[3];
    parts[0] = new Parts("Filter", "F300", 15583, 50, 7.0, "Supplier P");
    parts[1] = new Parts("Filter", "F300", 15583, 50, 1200, "Supplier E");
    parts[2] = null;

    String name = "Filter";
    String model = "F300";
    int partId = 15583;
    int quantity = 50;

    Scanner input = new Scanner("\nSupplier P\n");

    boolean expectedResult = true;
    boolean actualResult =
        (RfqSystem.chooseSupplier(parts, name, model, partId, quantity, input) != null);

    assertEquals(expectedResult, actualResult);
}

//Test – chooseSupplier finds Filter from Supplier E
@Test
public void testChooseSupplier_Filter_SupplierE() {
    Parts[] parts = new Parts[3];
    parts[0] = new Parts("Filter", "F300", 15583, 50, 7.0, "Supplier P");
    parts[1] = new Parts("Filter", "F300", 15583, 50, 1200, "Supplier E");
    parts[2] = null;

    String name = "Filter";
    String model = "F300";
    int partId = 15583;
    int quantity = 50;

    Scanner input = new Scanner("\nSupplier E\n");

    boolean expectedResult = true;
    boolean actualResult =
        (RfqSystem.chooseSupplier(parts, name, model, partId, quantity, input) != null);

    assertEquals(expectedResult, actualResult);
}

//Test – chooseSupplier returns null when Filter supplier does not exist
@Test
public void testChooseSupplier_Filter_SupplierNotFound() {
    Parts[] parts = new Parts[2];
    parts[0] = new Parts("Filter", "F300", 15583, 100, 1007, "Supplier B");
    parts[1] = null;

    String name = "Filter";
    String model = "F300";
    int partId = 15583;
    int quantity = 50;

    Scanner input = new Scanner("\nSupplier X\n");

    boolean expectedResult = false;
    boolean actualResult =
        (RfqSystem.chooseSupplier(parts, name, model, partId, quantity, input) != null);

    assertEquals(expectedResult, actualResult);
}

//-------------------Test 3-----------------------


@Test 
    public void testIsRarePart_TurbineBlade() {
        String name = "TurbineBlade";
        String model = "TBX90";
        int partId = 99999;

        boolean expectedResult = true;
        boolean actualResult = RfqSystem.isRarePart(name, model, partId);

        assertEquals(expectedResult, actualResult);
    }

    @Test 
    public void testIsRarePart_FuelControlHLX44() {
        String name = "FuelControlUnit";
        String model = "HLX44";
        int partId = 44444;

        boolean expectedResult = true;
        boolean actualResult = RfqSystem.isRarePart(name, model, partId);

        assertEquals(expectedResult, actualResult);
    }

  @Test 
    public void testIsRarePart_NormalPart_Bearing() {
        String name = "Bearing";
        String model = "B100";
        int partId = 21122;

        boolean expectedResult = false;
        boolean actualResult = RfqSystem.isRarePart(name, model, partId);

        assertEquals(expectedResult, actualResult);
    }

    @Test 
    public void testIsRarePart_NormalPart_Filter() {
        String name = "Filter";
        String model = "F300";
        int partId = 15583;

        boolean expectedResult = false;
        boolean actualResult = RfqSystem.isRarePart(name, model, partId);

        assertEquals(expectedResult, actualResult);
    }

    @Test 
    public void testIsRarePart_ModelNotFound() {
        String name = "Screen";
        String model = "LHMT";
        int partId = 00000;

        boolean expectedResult = false;
        boolean actualResult = RfqSystem.isRarePart(name, model, partId);

        assertEquals(expectedResult, actualResult);
    }

   @Test 
    public void testIsRarePart_WrongModel() {
        String name = "TurbineBlade";
        String model = "TBX900";    // not exact
        int partId = 99999;

        boolean expectedResult = false;
        boolean actualResult = RfqSystem.isRarePart(name, model, partId);

        assertEquals(expectedResult, actualResult);
    }
    
    @Test 
    public void testIsRarePart_WrongName() {
        String name = "TurbinePlade";
        String model = "TBX90";    // not exact
        int partId = 99999;

        boolean expectedResult = false;
        boolean actualResult = RfqSystem.isRarePart(name, model, partId);

        assertEquals(expectedResult, actualResult);
    }
    
    //-------------------Test 4-----------------------
    
    
    @Test
public void testShowSupplierParts_SupplierA_Found() {
    Parts[] parts = new Parts[3];
    parts[0] = new Parts("Bearing", "B100", 21122, 50, 2000, "Supplier A");
    parts[1] = new Parts("Belt",    "BL9",  61200, 300, 1640, "Supplier B");
    parts[2] = null;

    // first empty line for nextLine(), second line is actual name
    Scanner input = new Scanner("\nSupplier A\n");

    boolean expectedResult = true;
    boolean actualResult = Supplier.showSupplierParts(parts, input);

    assertEquals(expectedResult, actualResult);
}

@Test
public void testShowSupplierParts_SupplierNotFound() {
    Parts[] parts = new Parts[3];
    parts[0] = new Parts("Bearing", "B100", 21122, 50, 2000, "Supplier A");
    parts[1] = new Parts("Belt",    "BL9",  61200, 300, 1640, "Supplier B");
    parts[2] = null;

    Scanner input = new Scanner("\nSupplier X\n");

    boolean expectedResult = false;
    boolean actualResult = Supplier.showSupplierParts(parts, input);

    assertEquals(expectedResult, actualResult);
}

@Test
public void testShowSupplierParts_SupplierP_Found() {
    Parts[] parts = new Parts[3];
    parts[0] = new Parts("Filter", "F300", 15583, 50, 7.0, "Supplier P");
    parts[1] = new Parts("Filter", "F300", 15583, 50, 1200, "Supplier E");
    parts[2] = null;

    Scanner input = new Scanner("\nSupplier P\n");

    boolean expectedResult = true;
    boolean actualResult = Supplier.showSupplierParts(parts, input);

    assertEquals(expectedResult, actualResult);
}

//Test4 – showSupplierParts finds parts for Supplier E
@Test
public void testShowSupplierParts_SupplierE_Found() {
    Parts[] parts = new Parts[3];
    parts[0] = new Parts("Filter", "F300", 15583, 50, 7.0, "Supplier P");
    parts[1] = new Parts("Filter", "F300", 15583, 50, 1200, "Supplier E");
    parts[2] = null;

    Scanner input = new Scanner("\nSupplier E\n");

    boolean expectedResult = true;
    boolean actualResult = Supplier.showSupplierParts(parts, input);

    assertEquals(expectedResult, actualResult);
}


@Test
public void testShowSupplierParts_SupplierB_MultipleParts() {
    Parts[] parts = new Parts[4];
    parts[0] = new Parts("Filter", "F300", 15583, 100, 1007, "Supplier B");
    parts[1] = new Parts("Belt",   "BL9",  61200, 300, 1450, "Supplier B");
    parts[2] = new Parts("Bearing","B100", 21122, 50, 1500, "Supplier B");
    parts[3] = null;

    Scanner input = new Scanner("\nSupplier B\n");

    boolean expectedResult = true;
    boolean actualResult = Supplier.showSupplierParts(parts, input);

    assertEquals(expectedResult, actualResult);
}



//-------------------Test 4----------------------- 
    
    
    
    
    
    
    
    
    
    
}


  



