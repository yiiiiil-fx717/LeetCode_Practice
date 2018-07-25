package Leetcode;

import java.util.Arrays;

public class Leetcode_215 {
	
	public static int findKthLargest(int[] nums, int k){
		if(nums.length == 0 || nums == null){
			return 0;
		}
		Arrays.sort(nums);
        return nums[nums.length - k];
	}

	public static void main(String[] args) {
		int[] nums = {};
		int target = 4;
		System.out.println(findKthLargest(nums, target));
	}
}
