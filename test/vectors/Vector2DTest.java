
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nekrus
 */
public class Vector2DTest {
    
    public Vector2DTest() {
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

    @Test
    public void testLength() {
        System.out.println("length XD");
        Vector2D instance = new Vector2D(2, 4);
        double expResult = 4.47213595499958;
        double result = instance.length();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        Vector2D anotherVector = new Vector2D(2,3);
        Vector2D instance = new Vector2D(4,1);
        Vector2D expResult = new Vector2D(6,4);
        Vector2D result = instance.add(anotherVector);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMultiplyByScalar() {
        System.out.println("multiplyByScalar");
        double alpha = 3.2;
        Vector2D instance = new Vector2D(2,3);
        Vector2D expResult = new Vector2D(6.4,3.2);
        Vector2D result = instance.multiplyByScalar(alpha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector2D anotherVector = new Vector2D(2,3);
        Vector2D instance = new Vector2D(2,4);
        double expResult = 16.0;
        double result = instance.dotProduct(anotherVector);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Vector2D instance = new Vector2D(2,4);
        String expResult = "[2.0, 4.0]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object anotherObject = new Vector2D(2,4);
        Vector2D instance = new Vector2D(3,2);
        boolean expResult = false;
        boolean result = instance.equals(anotherObject);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
