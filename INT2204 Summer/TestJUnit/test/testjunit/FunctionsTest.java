/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CCNE
 */
public class FunctionsTest {

    public FunctionsTest() {
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
     * Test of max method, of class Functions.
     */
    @Test
    public void testMax() {
        System.out.println("max");
        int a = 5;
        int b = 10;
        int expResult = 10;
        int result = Functions.max(a, b);
        assertEquals(expResult, result);
        assertEquals(Functions.max(3, 4), 4);
        assertEquals(Functions.max(5, 4), 5);
        assertEquals(Functions.max(0, 4), 4);
        assertEquals(Functions.max(-6, 1), 1);
        
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of min method, of class Functions.
     */
    @Test
    public void testMin() {
        System.out.println("min");
        int[] a1 = new int[3];
        a1[0] = 1;
        a1[1] = 3;
        a1[2] = 2;
        
        int[] a2 = new int[6];
        a2[0] = 0;
        a2[1] = 3;
        a2[2] = 2;
        a2[3] = 5;
        a2[4] = 7;
        a2[5] = 2;
        
        int[] a3 = new int[2];
        a3[0] = 5;
        a3[1] = 3;
        
        int[] a4 = new int[4];
        a4[0] = 1;
        a4[1] = 3;
        a4[2] = 2;
        a4[3] = 2;
        
        int[] a5 = new int[1];
        a5[0] = 5;
        
//        int expResult = 1;
//        int result = Functions.min();
        assertEquals(Functions.min(a1), 1);
        assertEquals(Functions.min(a2), 0);
        assertEquals(Functions.min(a3), 3);
        assertEquals(Functions.min(a4), 1);
        assertEquals(Functions.min(a5), 5);
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
