package Leetcode;

import java.util.Arrays;

public class Leetcode_628 {
	public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        return Math.max(nums[0] * nums[1] * nums[size - 1], nums[size - 1] * nums[size - 2] * nums[size - 3]);
    }
}
