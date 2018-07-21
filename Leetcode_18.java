package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_18 {
	
	public static List<List<Integer>> fourSum(int[] nums, int target){
		List<List<Integer>> result = new ArrayList<>();
		if(nums == null || nums.length < 4){
			return result;
		}
		Arrays.sort(nums);
		
		for(int i = 0; i < nums.length - 3; i++){
			
			for(int j = i + 1; j < nums.length - 2; j++){
				int l = j + 1;
				int k = nums.length - 1;
				
				while(l < k){
					if(nums[i] + nums[j] + nums[l] + nums[k] == target){
						List<Integer> temp = new ArrayList<>();
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[l]);
						temp.add(nums[k]);
						result.add(temp);
						
						l++;
						k--;
						
						while(l < k && nums[l] == nums[l - 1]){
							l++;
						}
						while(l < k && nums[k] == nums[k + 1]){
							k--;
						}
					}else if(nums[i] + nums[j] + nums[l] + nums[k] < target){
						l++;
					}else{
						k--;
					}
				}
				while(j < nums.length - 2 && nums[j] == nums[j + 1]){
					j++;
				}
			}
			while(i < nums.length - 3 && nums[i] == nums[i + 1]){
				i++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = {1, 0, -1, 0, -2, 2};
		int target = 0;
		System.out.println(fourSum(nums, target));
	}
}
