package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_039 {
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        
        for(int item : candidates){
        	if(target == item){
        		List<Integer> temp = new ArrayList<>();
        		temp.add(item);
        		result.add(temp);
        	}else if(target > item){
        		for(List<Integer> temp : combinationSum(candidates, target - item)){
        			temp.add(item);
        			temp.sort((a, b) -> a - b);
        			if(!result.contains(temp)){
        				result.add(temp);
        			}
        		}
        	}
        }
        
        return result;
    }

	public static void main(String[] args) {
		int[] candidates = {2, 3, 6, 7};
		int target = 7;
		System.out.println(combinationSum(candidates, target));
	}
}
