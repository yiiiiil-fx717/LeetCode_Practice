package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_202 {
	public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        return solution(n, set);
    }
    
    private boolean solution(int num, Set<Integer> set){
        if(num == 1){
            return true;
        }else if(!set.add(num)){
            return false;
        }
        
        int result = 0;
        String strNum = String.valueOf(num);
        
        for(int i = 0; i < strNum.toCharArray().length; i++){
            int digit = Character.getNumericValue(strNum.charAt(i));
            digit *= digit;
            result += digit;
        }
        return solution(result, set);
    }
}
