package Leetcode;

public class Leetcode_303 /* class NumArray */ {
	private int[] sum;
    
    //constructor
    public NumArray(int[] nums) {
        sum =  new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            sum[i + 1] = nums[i] + sum[i];
        }
    }
    
    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
