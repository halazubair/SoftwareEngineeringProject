/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfqsystem;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author albad
 */
public class RfqSystemTest {
    
    public RfqSystemTest() {
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

    /**
     * Test of main method, of class RfqSystem.
   
    /**
     * Test of chooseSupplier method, of class RfqSystem.
     */
    @Test
    public void testChooseSupplier() {
        System.out.println("chooseSupplier");
        Parts[] parts = null;
        String name = "";
        String partModel = "";
        int partId = 0;
        int partQuantity = 0;
        Scanner i = null;
        Parts expResult = null;
        Parts result = RfqSystem.chooseSupplier(parts, name, partModel, partId, partQuantity, i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finalizeOrder method, of class RfqSystem.
     */
    @Test
    public void testFinalizeOrder() {
        System.out.println("finalizeOrder");
        Parts chosen = null;
        int partQuantity = 0;
        Scanner i = null;
        RfqSystem.finalizeOrder(chosen, partQuantity, i,"Saudia Airlines", 123,"Alya", 456);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRarePart method, of class RfqSystem.
     */
    @Test
    public void testIsRarePart() {
        System.out.println("isRarePart");
        String name = "";
        String partModel = "";
        int partId = 0;
        boolean expResult = false;
        boolean result = RfqSystem.isRarePart(name, partModel, partId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
