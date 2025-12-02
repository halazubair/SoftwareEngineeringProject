/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfqsystem;

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
public class purchaseOrderFileTest {
    
    public purchaseOrderFileTest() {
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
     * Test of purchaseOrderAttachment method, of class purchaseOrderFile.
     */
    @Test
    public void testPurchaseOrderAttachment() {
        System.out.println("purchaseOrderAttachment");
        Parts[] parts = null;
        String name = "";
        String partModel = "";
        int partId = 0;
        int partQuantity = 0;
        purchaseOrderFile.purchaseOrderAttachment(parts, name, partModel, partId, partQuantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
