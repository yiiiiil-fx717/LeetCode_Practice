package Leetcode;
public class Leetcode_485 {
	
	public static int findMaxConsecutiveOnes(int[] nums){
		int sum = 0;
		int max = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] == 1){
				sum++;
			}else{
				if(sum > max)
					max = sum;
				sum = 0;
			}
		}
		if(sum > max)
			max = sum;
		return max;
	}

	public static void main(String[] args) {
		int[] nums = {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}

}
