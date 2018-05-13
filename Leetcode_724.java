package Leetcode;

public class Leetcode_724 {
	public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum  = 0;
        for(int number : nums){
            totalSum += number;
        }
        for(int i = 0; i < nums.length; i++){
            if(totalSum - leftSum - nums[i] == leftSum){
                return i;
            }else{
                leftSum += nums[i];
            }
        }
        return -1;
    }
}
