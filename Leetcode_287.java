package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_287 {
	public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        
        for(int number : nums){
            if(set.contains(number)){
                return number;
            }else{
                set.add(number);
            }
        }
        return -99;
    }
}
