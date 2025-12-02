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
public class BuyerTest {
    
    public BuyerTest() {
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
     * Test of setCompanyName method, of class Buyer.
     */
    @Test
    public void testSetCompanyName() {
        System.out.println("setCompanyName");
        String companyName = "";
        Buyer instance = null;
        instance.setCompanyName(companyName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCountry method, of class Buyer.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String Country = "";
        Buyer instance = null;
        instance.setCountry(Country);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCity method, of class Buyer.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String City = "";
        Buyer instance = null;
        instance.setCity(City);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZipcode method, of class Buyer.
     */
    @Test
    public void testSetZipcode() {
        System.out.println("setZipcode");
        int zipcode = 0;
        Buyer instance = null;
        instance.setZipcode(zipcode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompanyName method, of class Buyer.
     */
    @Test
    public void testGetCompanyName() {
        System.out.println("getCompanyName");
        Buyer instance = null;
        String expResult = "";
        String result = instance.getCompanyName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCountry method, of class Buyer.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        Buyer instance = null;
        String expResult = "";
        String result = instance.getCountry();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCity method, of class Buyer.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Buyer instance = null;
        String expResult = "";
        String result = instance.getCity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZipcode method, of class Buyer.
     */
    @Test
    public void testGetZipcode() {
        System.out.println("getZipcode");
        Buyer instance = null;
        int expResult = 0;
        int result = instance.getZipcode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Buyer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Buyer instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
