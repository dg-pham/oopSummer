package shape;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Go Eun Sung
 */
public class CircleTest {
    
    public CircleTest() {
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
     * Test of getArea method, of class Circle.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Circle instance = new Circle(10);
        double expResult = 314.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getPerimeter method, of class Circle.
     */
    @Test
    public void testGetPerimeter() {
        System.out.println("getPerimeter");
        Circle instance = new Circle(10);
        double expResult = 62.8;
        double result = instance.getPerimeter();
        assertEquals(expResult, result, 0.0);
    }

}
