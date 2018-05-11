package Leetcode;

import java.util.Arrays;

public class Leetcode_169 {
	public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
