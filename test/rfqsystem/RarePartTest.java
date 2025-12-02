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
public class RarePartTest {
    
    public RarePartTest() {
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
     * Test of setPartName method, of class RarePart.
     */
    @Test
    public void testSetPartName() {
        System.out.println("setPartName");
        String partName = "";
        RarePart instance = new RarePart();
        instance.setPartName(partName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPartModel method, of class RarePart.
     */
    @Test
    public void testSetPartModel() {
        System.out.println("setPartModel");
        String partModel = "";
        RarePart instance = new RarePart();
        instance.setPartModel(partModel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPartId method, of class RarePart.
     */
    @Test
    public void testSetPartId() {
        System.out.println("setPartId");
        int partId = 0;
        RarePart instance = new RarePart();
        instance.setPartId(partId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPartName method, of class RarePart.
     */
    @Test
    public void testGetPartName() {
        System.out.println("getPartName");
        RarePart instance = new RarePart();
        String expResult = "";
        String result = instance.getPartName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPartModel method, of class RarePart.
     */
    @Test
    public void testGetPartModel() {
        System.out.println("getPartModel");
        RarePart instance = new RarePart();
        String expResult = "";
        String result = instance.getPartModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPartId method, of class RarePart.
     */
    @Test
    public void testGetPartId() {
        System.out.println("getPartId");
        RarePart instance = new RarePart();
        int expResult = 0;
        int result = instance.getPartId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class RarePart.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        RarePart instance = new RarePart();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
