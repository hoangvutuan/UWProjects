/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flattennestedarray;

import java.util.Arrays;
import java.util.List;
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
public class TestNestedIterator {
    
    public TestNestedIterator() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testWithSampleTestCase()  throws Exception {
         //input:
        // [[1,2,[3]],4]
        //output:
        //[1,2,3,4]

        NestedInteger num1 = new NestedInteger(1);      
        NestedInteger num2 = new NestedInteger(2);
        
        NestedInteger num3 = new NestedInteger(3);    
        NestedInteger num4 = new NestedInteger(4);
        
        NestedInteger num5 = new NestedInteger(5);
    
        NestedInteger num3_ = new NestedInteger(Arrays.asList(num3));
        NestedInteger num123_ = new NestedInteger(Arrays.asList(num1, num2, num3_));
        List<NestedInteger> nestedList = Arrays.asList(num123_, num4);
        List<Integer> expectedNums = Arrays.asList(1, 2, 3, 4);
        NestedIterator i = new NestedIterator(nestedList);
        List<Integer> actualNums = i.getFlattenedList();
        assertEquals(expectedNums, actualNums);
    }
    
    @Test
    public void testWhen1NestedArrayInsideList()  throws Exception {
         //input:
        //[1,2,[3,4],5]
        //output:
        //[1,2,3,4,5]

        NestedInteger num1 = new NestedInteger(1);      
        NestedInteger num2 = new NestedInteger(2);
        
        NestedInteger num3 = new NestedInteger(3);    
        NestedInteger num4 = new NestedInteger(4);
        
        NestedInteger num5 = new NestedInteger(5);
    
        NestedInteger num34 = new NestedInteger(Arrays.asList(num3, num4));
        List<NestedInteger> nestedList = Arrays.asList(num1, num2, num34, num5);
        List<Integer> expectedNums = Arrays.asList(1, 2, 3, 4, 5);
        NestedIterator i = new NestedIterator(nestedList);
        List<Integer> actualNums = i.getFlattenedList();
        assertEquals(expectedNums, actualNums);
    }
    
    @Test
    public void testWhen2NestedArrayInsideList()  throws Exception {
         //input:
        //[[1,2],[3,4],5]
        //output:
        //[1,2,3,4,5]

        NestedInteger num1 = new NestedInteger(1);      
        NestedInteger num2 = new NestedInteger(2);
        NestedInteger num12 = new NestedInteger(Arrays.asList(num1, num2));
        
        NestedInteger num3 = new NestedInteger(3);    
        NestedInteger num4 = new NestedInteger(4);
        NestedInteger num34 = new NestedInteger(Arrays.asList(num3, num4));
        
        NestedInteger num5 = new NestedInteger(5);
    
        
        List<NestedInteger> nestedList = Arrays.asList(num12, num34, num5);
        List<Integer> expectedNums = Arrays.asList(1, 2, 3, 4, 5);
        NestedIterator i = new NestedIterator(nestedList);
        List<Integer> actualNums = i.getFlattenedList();
        assertEquals(expectedNums, actualNums);
    }
    
    @Test
    public void testWhenManyLevelNestedArrayInsideList()  throws Exception {
         //input:
        //[[[1,2],[[3],4],5],6]
        //output:
        //[1,2,3,4,5,6]

        NestedInteger num1 = new NestedInteger(1);      
        NestedInteger num2 = new NestedInteger(2);
        NestedInteger num12 = new NestedInteger(Arrays.asList(num1, num2));
        
        NestedInteger num3 = new NestedInteger(3); 
        NestedInteger num3_ = new NestedInteger(Arrays.asList(num3));
        NestedInteger num4 = new NestedInteger(4);
        NestedInteger num3_4 = new NestedInteger(Arrays.asList(num3_, num4));
        
        NestedInteger num5 = new NestedInteger(5);
        NestedInteger num6 = new NestedInteger(6);
        NestedInteger num123_45 = new NestedInteger(Arrays.asList(num12, num3_4, num5));
        List<NestedInteger> nestedList = Arrays.asList(num123_45, num6);
        List<Integer> expectedNums = Arrays.asList(1, 2, 3, 4, 5, 6);
        NestedIterator i = new NestedIterator(nestedList);
        List<Integer> actualNums = i.getFlattenedList();
        assertEquals(expectedNums, actualNums);
    }
    
    @Test(expected=Exception.class)
    public void testWhenNoNestedArrayInsideList() throws Exception {
         //input:
        //[1,2,3,4,5]
        //output:
        //[1,2,3,4,5]

        NestedInteger num1 = new NestedInteger(1);      
        NestedInteger num2 = new NestedInteger(2);
        
        NestedInteger num3 = new NestedInteger(3);    
        NestedInteger num4 = new NestedInteger(4);
        
        NestedInteger num5 = new NestedInteger(5);
    
        List<NestedInteger> nestedList = null;
        List<Integer> expectedNums = Arrays.asList(1, 2, 3, 4, 5);
        NestedIterator i = new NestedIterator(nestedList);
        List<Integer> actualNums = i.getFlattenedList();
        assertEquals(expectedNums, actualNums);
    }
    
    @Test(expected=Exception.class)
    public void testWhenInputIsNull() throws Exception {
        //input: null
        //output: throws 
        List<NestedInteger> nestedList = null;
        NestedIterator i = new NestedIterator(nestedList);            
    }
}
