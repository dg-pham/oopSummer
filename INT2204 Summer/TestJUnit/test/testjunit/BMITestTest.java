/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjunit;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author CCNE
 */
public class BMITestTest {
    
    public BMITestTest() {
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
     * Test of main method, of class BMITest.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        BMI p1 = new BMI(1.62, 50);
        BMI p2 = new BMI(1.72, 50);
        BMI p3 = new BMI(1.30, 50);
        BMI p4 = new BMI(1.62, 60);
        BMI p5 = new BMI(1.82, 40);
        
//        p1.comments();
        assertEquals(p1.comments(), "Bình thường");
        assertEquals(p2.comments(), "Thiếu cân");
        assertEquals(p3.comments(), "Béo phì");
        assertEquals(p4.comments(), "Bình thường");
        assertEquals(p5.comments(), "Thiếu cân");
        
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
