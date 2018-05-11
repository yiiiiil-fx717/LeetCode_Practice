package Leetcode;
import java.util.Arrays;

public class Leetcode_283 {
	
	static void removeZeros(int[] nums){
		int count = 0;
		int index = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != 0){
				nums[index] = nums[i];
				index++;
			}else{
				count++;
			}
		}
		for(int i = nums.length - 1; i >= nums.length - count; i--){
			nums[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12,0,9,0,3,4};
		removeZeros(nums);
		System.out.print(Arrays.toString(nums));
	}
}
