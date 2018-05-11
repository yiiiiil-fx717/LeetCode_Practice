package Leetcode;

public class Leetcode_027 {
	
	static int removeElement(int[] nums, int val){
		int total = nums.length;
		int count = 0;;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] == val){
				count++;
			}
		}
		return total-count;
	}
/*	
	static int removeElement1(int[] nums, int val){
		int index = 0;
		int count = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != val){
				nums[index] = nums[i];
				index++;
			}else{
				count++;
			}
		}
		for(int i = nums.length - 1; i >= nums.length - count; i--){
			nums[i] = val;
		}
		return nums.length - count;
	}
	*/
	public static void main(String[] args) {
		int[] nums = {3,2,2,3,2,2,2,3,3,4};
		int val = 3;
		System.out.print(removeElement(nums,val));

	}

}
