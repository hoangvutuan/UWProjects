/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import geometry.Geometry;
import geometry.MyPoint3D;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vutuanhoang
 */
public class TestGeometry {
    
    static Geometry g;
    public TestGeometry() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       g = new Geometry();
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testGetClosestPointOnSegmentWhenIn2DCases1() {
        MyPoint3D pointA = new MyPoint3D(0, 1.5, 0);
        MyPoint3D pointB = new MyPoint3D(3, 0, 0);
        MyPoint3D pointC = new MyPoint3D(2, 2, 0);        
        MyPoint3D pointC1 = Geometry.getClosestPointOnSegment(pointA, pointB, pointC);
        MyPoint3D expPointC1 = new MyPoint3D(1.4, 0.8, 0.0);
        assertEquals(expPointC1, pointC1);
    }
    
    @Test
    public void testGetClosestPointOnSegmentWhenIn2DCases2() {
        MyPoint3D pointA = new MyPoint3D(0, 3, 0);
        MyPoint3D pointB = new MyPoint3D(1.5, 0, 0);
        MyPoint3D pointC = new MyPoint3D(3, 2, 0);        
        MyPoint3D pointC1 = Geometry.getClosestPointOnSegment(pointA, pointB, pointC);
        MyPoint3D expPointC1 = new MyPoint3D(1, 1, 0);
        assertEquals(expPointC1, pointC1);
    }
    /*
    @Test
    public void testGetClosestPointOnSegmentWhenIn3DCases1() {
        MyPoint3D pointA = new MyPoint3D(-2, -4, 5);
        MyPoint3D pointB = new MyPoint3D(0, 0, 1);
        MyPoint3D pointC = new MyPoint3D(1, 1, 1);      
        MyPoint3D pointC1 = Geometry.getClosestPointOnSegment(pointA, pointB, pointC);
        MyPoint3D expPointC1 = new MyPoint3D(1, 1, 0);
        assertEquals(expPointC1, pointC1);
    } 
*/
    @Test
    public void testGetClosestPointOnSegmentWhenIn2DCases3() {
        MyPoint3D pointA = new MyPoint3D(0, 9, 0);
        MyPoint3D pointB = new MyPoint3D(1.5, 0, 0);
        MyPoint3D pointC = new MyPoint3D(3, 8, 0);        
        MyPoint3D pointC1 = Geometry.getClosestPointOnSegment(pointA, pointB, pointC);
        double x = 9 / ((1.0) * 37);
        double y = 279 / ((1.0) * 37);
        MyPoint3D expPointC1 = new MyPoint3D(x, y, 0);
        assertEquals(expPointC1, pointC1);
    }
    
    @Test
    public void testGetClosestPointOnSegmentWhenTheGivenPointIsTheSameAsSegmentStart() {
        MyPoint3D pointA = new MyPoint3D(0, 9, 0);
        MyPoint3D pointB = new MyPoint3D(1.5, 0, 0);
        MyPoint3D pointC = new MyPoint3D(0, 9, 0);        
        MyPoint3D pointC1 = Geometry.getClosestPointOnSegment(pointA, pointB, pointC);
        MyPoint3D expPointC1 = new MyPoint3D(0, 9, 0);
        assertEquals(expPointC1, pointC1);
    }
    
    @Test
    public void testGetClosestPointOnSegmentWhenTheGivenPointIsTheSameAsSegmentEnd() {
        MyPoint3D pointA = new MyPoint3D(0, 9, 0);
        MyPoint3D pointB = new MyPoint3D(1.5, 0, 0);
        MyPoint3D pointC = new MyPoint3D(1.5, 0, 0);        
        MyPoint3D pointC1 = Geometry.getClosestPointOnSegment(pointA, pointB, pointC);
        MyPoint3D expPointC1 = new MyPoint3D(1.5, 0, 0);
        assertEquals(expPointC1, pointC1);
    }
    
    @Test
    public void testGetClosestPointOnSegmentWhenProjectionOfTheGivenPointBelowXAxisOutsideOfTheSegment() {
        MyPoint3D pointA = new MyPoint3D(0, 9, 0);
        MyPoint3D pointB = new MyPoint3D(1.5, 0, 0);
        MyPoint3D pointC = new MyPoint3D(0, -4, 0);        
        MyPoint3D pointC1 = Geometry.getClosestPointOnSegment(pointA, pointB, pointC);
        MyPoint3D expPointC1 = new MyPoint3D(1.5, 0, 0);
        assertEquals(expPointC1, pointC1);
    }
    
    @Test
    public void testGetClosestPointOnSegmentWhenProjectionOfTheGivenPointAboveXAxisOutsideOfTheSegment() {
        MyPoint3D pointA = new MyPoint3D(0, 9, 0);
        MyPoint3D pointB = new MyPoint3D(1.5, 0, 0);
        MyPoint3D pointC = new MyPoint3D(0, 10, 0);        
        MyPoint3D pointC1 = Geometry.getClosestPointOnSegment(pointA, pointB, pointC);
        MyPoint3D expPointC1 = new MyPoint3D(0, 9, 0);
        assertEquals(expPointC1, pointC1);
    }
}
