package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode_078 {
	
	//memory limit exceeded
	public static List<List<Integer>> subsets1(int[] nums){
		List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0 || nums == null){
        	result.add(new ArrayList<Integer>());
            return result;
        }
        
        List<Integer> first = new ArrayList<>();
        first.add(nums[0]);
        result.add(first);
        
        for(int i = 1; i < nums.length; i++){
        	result.add(new ArrayList<>(i));
            List<List<Integer>> newResult = new ArrayList<>();
            
            for(List<Integer> temp : result){
                int size = temp.size() + 1;
                for(int j = 0; j < size; j++){
                    List<Integer> item = new ArrayList<>(temp);
                    item.add(j, nums[i]);
                    newResult.add(item);
                }
            }
            result.addAll(newResult);
        }
        for(List<Integer> item : result){
        	Collections.sort(item);
        }
        
        Set<List<Integer>> set = new HashSet<>();
        set.add(new ArrayList<>());
        for(List<Integer> list : result){
        	set.add(list);
        }
        List<List<Integer>> finalResult = new ArrayList<>(set);
        
        return finalResult;
	}
	
	public static List<List<Integer>> subsets2(int[] nums){
		List<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<Integer>());
        if(nums.length == 0 || nums == null){
            return result;
        }
        
        for(int number : nums){
        	//int size = result.size(), will result duplication
        	int size = result.size();
        	
        	for(int i = 0; i < size; i++){
        		List<Integer> temp = new ArrayList<>(result.get(i));
        		temp.add(number);
        		result.add(temp);
        	}
        }
        return result;
	}

	public static void main(String[] args) {
		int[] nums = {1,2};
		System.out.println(subsets2(nums));
	}
}
