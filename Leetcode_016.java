package Leetcode;

import java.util.Arrays;

public class Leetcode_016 {
	
	public static int threeSumClosest(int[] nums, int target){
		int result = nums[0] + nums[1] + nums[2];
		int diff = Math.abs(result - target);
		
		Arrays.sort(nums);
		for(int i = 0; i < nums.length - 2; i++){
			int j = i + 1;
			int k = nums.length - 1;
			
			while(j < k){
				int sum = nums[i] + nums[j] + nums[k];
				int tempDiff = Math.abs(sum - target);
				if(tempDiff < diff){
					diff = tempDiff;
					result = sum;
				}else if(sum < target){
					j++;
				}else{
					k--;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 4, 8, 16, 32, 64, 128};
		int target = 82;
		System.out.println(Integer.toString(threeSumClosest(nums, target)));
	}
}
