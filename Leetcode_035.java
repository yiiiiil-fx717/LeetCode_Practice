package Leetcode;

public class Leetcode_035 {
	
	public static int searchPosition(int[] nums, int target){
		for(int index = 0; index < nums.length; index++){
			if(nums[index] == target){
				return index;
			}else if(nums[index] > target){
				return index;
			}else if(target > nums[nums.length-1]){
				return nums.length;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = {1,3,5,6,10,12};
		int target = 15;
		System.out.println(searchPosition(nums,target));
		System.out.println(5 % 2);
	}

}
