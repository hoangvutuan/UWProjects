/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flattennestedarray;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vutuanhoang
 */
class NestedInteger {

    Integer val;
    List<NestedInteger> nums;

    public NestedInteger(Integer val) {
        this.val = val;
    }

    public NestedInteger(List<NestedInteger> nums) {
        this.nums = nums;
    }

    
    
    public NestedInteger() {
        val = new Integer(0);
        nums = new ArrayList<NestedInteger>();
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    
    public NestedInteger(Integer val, List<NestedInteger> nums) {
        this.val = val;
        this.nums = nums;
    }
    
    
    
  
    public boolean isInteger() {
        return val != null;

    }


    public Integer getInteger() {
       return val;
    }

    public List<NestedInteger> getList() {
        return nums;
    }


    
}
