package Leetcode;
import java.util.*;

public class Leetcode_496 {
	
	public static int[] nextGreaterElement(int[] nums1, int[] nums2){
		int temp = 0;
		int[] result = new int[nums1.length];
		for(int i = 0; i < nums1.length; i++){
			for(int j = 0; j < nums2.length; j++){
				if(nums1[i] == nums2[j] && j != nums2.length - 1){
					temp = j;
				}
			}
			result[i] = nums2[temp + 1];
			temp = 0;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));

	}

}
