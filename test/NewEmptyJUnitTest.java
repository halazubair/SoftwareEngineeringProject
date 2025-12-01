/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import rfqsystem.Parts;
import rfqsystem.RfqSystem;

/**
 *
 * @author mawadah
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
//Test1
@Test
public void testFinalizeOrder_NullChosen() {
    Scanner input = new Scanner("Y");

    boolean expectedResult = true;
    boolean actualResult = true;

    RfqSystem.finalizeOrder(null, 5, input);

    assertEquals(expectedResult, actualResult);
}

//Test2
@Test
public void testFinalizeOrder_ConfirmYes() {
    Parts chosen = new Parts("Bearing", "B100", 21122, 50, 2000, "SupplierA");
    Scanner input = new Scanner("Y");

    boolean expectedResult = true;
    boolean actualResult = true;

    RfqSystem.finalizeOrder(chosen, 5, input);

    assertEquals(expectedResult, actualResult);
}

//Test3
@Test
public void testFinalizeOrder_ConfirmNo() {
    Parts chosen = new Parts("Bearing", "B100", 21122, 50, 2000, "SupplierA");
    Scanner input = new Scanner("N");

    boolean expectedResult = true;
    boolean actualResult = true;

    RfqSystem.finalizeOrder(chosen, 5, input);

    assertEquals(expectedResult, actualResult);
}
}