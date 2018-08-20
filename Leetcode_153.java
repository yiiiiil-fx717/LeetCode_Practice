package Leetcode;

import java.util.Arrays;

public class Leetcode_153 {
	public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
