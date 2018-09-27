package Leetcode;

public class Leetcode_080 {
	
	private static int removeDuplicates(int[] nums){
		int length = nums.length;
		if(length < 3) return length;
		
		int pointer = 2;
		for(int i = 2; i < length; i++){
			if(nums[i] != nums[pointer - 2]){
				nums[pointer] = nums[i];
				pointer++;
			}
		}
		
		return pointer;
	}
	
	public static void main(String args[]){
		int[] nums1 = {1,1,1,2,2,3};
		int[] nums2 = {0,0,1,1,1,1,2,3,3};
		
		System.out.println(removeDuplicates(nums1));
		System.out.println(removeDuplicates(nums2));
	}
}
