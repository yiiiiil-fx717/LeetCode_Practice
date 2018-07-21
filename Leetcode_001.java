package Leetcode;
import java.util.Arrays;

public class Leetcode_001 {

	public static int[] twoSum(int[] nums, int target){
		int temp;
		for(int i = 0; i < nums.length; i++){
			temp = target - nums[i];
			for(int j = i + 1; j < nums.length; j++){
				if(nums[j] == temp){
					int[] arr1 = {i,j};
					return arr1;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 17;
		System.out.println(Arrays.toString(twoSum(nums,target)));
	}

}
