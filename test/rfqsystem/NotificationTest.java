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
public class NotificationTest {
    
    public NotificationTest() {
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
     * Test of setNotification method, of class Notification.
     */
    @Test
    public void testSetNotification() {
        System.out.println("setNotification");
        String notification = "";
        Notification instance = new Notification();
        instance.setNotification(notification);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecieverId method, of class Notification.
     */
    @Test
    public void testSetRecieverId() {
        System.out.println("setRecieverId");
        String recieverId = "";
        Notification instance = new Notification();
        instance.setRecieverId(recieverId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSenderId method, of class Notification.
     */
    @Test
    public void testSetSenderId() {
        System.out.println("setSenderId");
        String senderId = "";
        Notification instance = new Notification();
        instance.setSenderId(senderId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecieverName method, of class Notification.
     */
    @Test
    public void testSetRecieverName() {
        System.out.println("setRecieverName");
        String recieverName = "";
        Notification instance = new Notification();
        instance.setRecieverName(recieverName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSenderName method, of class Notification.
     */
    @Test
    public void testSetSenderName() {
        System.out.println("setSenderName");
        String senderName = "";
        Notification instance = new Notification();
        instance.setSenderName(senderName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsRead method, of class Notification.
     */
    @Test
    public void testSetIsRead() {
        System.out.println("setIsRead");
        boolean isRead = false;
        Notification instance = new Notification();
        instance.setIsRead(isRead);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsSent method, of class Notification.
     */
    @Test
    public void testSetIsSent() {
        System.out.println("setIsSent");
        boolean isSent = false;
        Notification instance = new Notification();
        instance.setIsSent(isSent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotification method, of class Notification.
     */
    @Test
    public void testGetNotification() {
        System.out.println("getNotification");
        Notification instance = new Notification();
        String expResult = "";
        String result = instance.getNotification();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecieverId method, of class Notification.
     */
    @Test
    public void testGetRecieverId() {
        System.out.println("getRecieverId");
        Notification instance = new Notification();
        String expResult = "";
        String result = instance.getRecieverId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSenderId method, of class Notification.
     */
    @Test
    public void testGetSenderId() {
        System.out.println("getSenderId");
        Notification instance = new Notification();
        String expResult = "";
        String result = instance.getSenderId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecieverName method, of class Notification.
     */
    @Test
    public void testGetRecieverName() {
        System.out.println("getRecieverName");
        Notification instance = new Notification();
        String expResult = "";
        String result = instance.getRecieverName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSenderName method, of class Notification.
     */
    @Test
    public void testGetSenderName() {
        System.out.println("getSenderName");
        Notification instance = new Notification();
        String expResult = "";
        String result = instance.getSenderName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsRead method, of class Notification.
     */
    @Test
    public void testIsIsRead() {
        System.out.println("isIsRead");
        Notification instance = new Notification();
        boolean expResult = false;
        boolean result = instance.isIsRead();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsSent method, of class Notification.
     */
    @Test
    public void testIsIsSent() {
        System.out.println("isIsSent");
        Notification instance = new Notification();
        boolean expResult = false;
        boolean result = instance.isIsSent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendNotification method, of class Notification.
     */
    @Test
    public void testSendNotification() {
        System.out.println("sendNotification");
        String message = "";
        Notification.sendNotification(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Notification.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Notification instance = new Notification();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
