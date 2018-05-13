package Leetcode;

import java.util.Arrays;

public class Leetcode_747 {
	public int dominantIndex(int[] nums) {
        int max = 0;
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        int half = max / 2;
        Arrays.sort(nums);
        
        for(int i = 0; i <= nums.length - 2; i++){
            if(nums[i] > half){
                return -1;
            }
        }
        return index;
    }
}
