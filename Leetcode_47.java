package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode_47 {
	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums.length == 0 || nums == null){
        	return result;
        }
        
        List<Integer> first = new ArrayList<Integer>();
        first.add(nums[0]);
        result.add(first);
        
        for(int i = 1; i < nums.length; i++){
        	List<List<Integer>> newResult = new ArrayList<List<Integer>>();
        	
        	for(List<Integer> temp : result){
        		int size = temp.size() + 1;
        		for(int j = 0; j < size; j++){
        			List<Integer> item = new ArrayList<Integer>(temp);
        			item.add(j, nums[i]);
        			newResult.add(item);
        		}
        	}
        	result = newResult;
        }
        
        Set<List<Integer>> set = new HashSet<>();
        for(List<Integer> list : result){
        	set.add(list);
        }
        List<List<Integer>> finalResult = new ArrayList<>(set);
        
        return finalResult;
	}

	public static void main(String[] args) {
		int[] array = {1, 1, 2};
		System.out.println(permute(array));
	}
}
