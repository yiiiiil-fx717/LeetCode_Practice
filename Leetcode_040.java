package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_040 {
	
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(candidates == null || candidates.length == 0) return result;
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(candidates, target, result, temp, 0);
        
        return result;
    }
	
	private static void findCombinations(int[] candidates, int target, List<List<Integer>> result, List<Integer> temp, int i){
		if(i > candidates.length || target < 0) return;
		if(target == 0){
			result.add(new ArrayList<>(temp));
			return;
		}
		
		for(int p = i; p < candidates.length; p++){
			temp.add(candidates[p]);
			findCombinations(candidates, target - candidates[p], result, temp, p + 1);
			temp.remove(temp.size() - 1);  //backtrack, remove current node from list
			while(p < candidates.length - 1 && candidates[p] == candidates[p + 1]){
				p++;
			}
		}
	}
	
	public static void main(String args[]){
		int[] candidates = {10, 1, 2, 7, 6, 1, 5};    //{1, 1, 2, 5, 6, 7, 10}
		int target = 8;
		System.out.println(combinationSum2(candidates, target));
	}
}
