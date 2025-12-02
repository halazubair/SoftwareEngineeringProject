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
public class InvoiceTest {
    
    public InvoiceTest() {
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
     * Test of printReceipt method, of class Invoice.
     */
    @Test
    public void testPrintReceipt() {
        System.out.println("printReceipt");
        Parts part = null;
        int quantity = 0;
        Invoice.printReceipt(part, quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notFinalizedInvoice method, of class Invoice.
     */
    @Test
    public void testNotFinalizedInvoice() {
        System.out.println("notFinalizedInvoice");
        Parts part = null;
        int quantity = 0;
        Invoice.notFinalizedInvoice(part, quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
