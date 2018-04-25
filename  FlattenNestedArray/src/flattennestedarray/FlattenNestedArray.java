/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flattennestedarray;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author vutuanhoang
 */
public class FlattenNestedArray  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception  {
        // TODO code application logic here
        
        //input:
        //[1,2,[3,4],5]

        //output:
        //[1,2,3,4,5]
	//test1


        NestedInteger num1 = new NestedInteger(1);
         
        NestedInteger num2 = new NestedInteger(2);    
        NestedInteger num3 = new NestedInteger(3);    
        NestedInteger num4 = new NestedInteger(4);
        NestedInteger num5 = new NestedInteger(5);
    
        NestedInteger num34 = new NestedInteger(Arrays.asList(num3, num4));
        List<NestedInteger> nestedList = Arrays.asList(num1, num2, num34, num5);
        
        NestedIterator i = new NestedIterator(nestedList);
        while (i.hasNext()) {
            System.out.print(i.next());
        }
        System.out.println();
    }
    
}
