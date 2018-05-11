package Leetcode;
public class Leetcode_268 {
	
	public static int missingNumber(int[] nums){
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < nums.length; i++){
			sum1 = sum1 + nums[i];
		}
		sum2 = ((0 + nums.length) * (nums.length + 1)) / 2;
		return sum2 - sum1;
	}

	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4,5,7,8};
		System.out.println(missingNumber(nums));

	}

}
