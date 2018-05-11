package Leetcode;

public class Leetcode_053 {
	public int maxSubArray(int[] nums) {
        int curSum = 0;  
        int maxSum = nums[0];  
          
        for(int i = 0; i < nums.length; i++){ 
            if(curSum >= 0)  {  
                curSum += nums[i];  
            }else{  
                curSum = nums[i];  
            }
            if(curSum > maxSum)  maxSum = curSum;
        }
        return maxSum;
    }
}
