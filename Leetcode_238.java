package Leetcode;

public class Leetcode_238 {
	public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        int[] bottom = new int[nums.length];
        bottom[0] = 1;
        
        int[] top = new int[nums.length];
        top[top.length - 1] = 1;
        
        for(int i = 1; i < bottom.length; i++){
            bottom[i] = bottom[i - 1] * nums[i - 1];
        }
        
        for(int i = top.length - 2; i >= 0; i--){
            top[i] = top[i + 1] * nums[i + 1];
        }
        
        for(int i = 0; i < result.length; i++){
            result[i] = top[i] * bottom[i];
        }
        
        return result;
    }
}
