/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

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
public class LayerTest {

    public LayerTest() {
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
     * Test of deleteTriangle method, of class Layer.
     */
    @Test
    public void testDeleteTriangle() {
        System.out.println("deleteTriangle");
        Layer instance = new Layer();

        Shape s1 = new Triangle(3, 4, 5);
        Shape s2 = new Circle(10);
        Shape s3 = new Square(10);
        Shape s4 = new Rectangle(10, 5);

        instance.layers.add(s1);
        instance.layers.add(s2);
        instance.layers.add(s3);
        instance.layers.add(s4);

        instance.deleteTriangle();
        
        assertEquals(instance.layers.size(), 3);
        assertNotEquals(instance.layers.get(0) instanceof Triangle, true);
    }

}
