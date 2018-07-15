package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_22 {
	public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        solution(list, "", 0, 0, n);
        return list;
    }
    
    private void solution(List<String> list, String current, int left, int right, int nums){
        if(current.length() == (nums * 2)){
            list.add(current);
            return;
        }
        
        if(left < nums){
            solution(list, current + "(", left + 1, right, nums);
        }
        if(right < left){
            solution(list, current + ")", left, right + 1, nums);
        }
    }
}
