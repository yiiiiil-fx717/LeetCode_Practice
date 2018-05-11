package Leetcode;
public class Leetcode_414 {
	
	public static int thirdMax(int[] nums){
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		int temp, temp1, temp2;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] > max1){
				max1 = nums[i];
				
			}
		}
		return max1;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,7,8};
		System.out.println(thirdMax(nums));
	}

}
