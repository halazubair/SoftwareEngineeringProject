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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author albad
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({rfqsystem.RfqSystemTest.class, rfqsystem.BuyerTest.class, rfqsystem.SupplierTest.class, rfqsystem.AuctionTest.class, rfqsystem.PartsTest.class, rfqsystem.purchaseOrderFileTest.class, rfqsystem.RarePartTest.class, rfqsystem.NotificationTest.class, rfqsystem.InvoiceTest.class})
public class RfqsystemSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
