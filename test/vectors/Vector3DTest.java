
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
public class Vector3DTest {
    
    public Vector3DTest() {
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
        System.out.println("length");
        Vector3D instance = new Vector3D(2,4,5);
        double expResult = 6.708203932499369;
        double result = instance.length();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        Vector3D anotherVector = new Vector3D(2,3,4);
        Vector3D instance = new Vector3D(4,3,2);
        Vector3D expResult = new Vector3D(6.0,6.0,6.0);
        Vector3D result = instance.add(anotherVector);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMultiplyByScalar() {
        System.out.println("multiplyByScalar");
        double alpha = 5.2;
        Vector3D instance = new Vector3D(2,3,4);
        Vector3D expResult = new Vector3D(10.4, 15.600000000000001, 20.8);
        Vector3D result = instance.multiplyByScalar(alpha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector3D anotherVector = new Vector3D(2,3,4);
        Vector3D instance = new Vector3D(4,3,2);
        double expResult = 25.0;
        double result = instance.dotProduct(anotherVector);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCrossProduct() {
        System.out.println("crossProduct");
        Vector3D anotherVector = new Vector3D(2,3,4);
        Vector3D instance = new Vector3D(4,3,2);
        Vector3D expResult = new Vector3D(6.0, -12.0, 6.0);
        Vector3D result = instance.crossProduct(anotherVector);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Vector3D instance = new Vector3D(2,3,4);
        String expResult = "[2.0, 3.0, 4.0]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object anotherObject = new Vector3D(2,3,4);
        Vector3D instance = new Vector3D(4,3,2);
        boolean expResult = false;
        boolean result = instance.equals(anotherObject);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
