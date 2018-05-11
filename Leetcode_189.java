package Leetcode;
import java.util.Arrays;

public class Leetcode_189 {
	
	//Rotate an array of n elements to the right by k steps.
	//For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
	
	public static void rotate(int[] nums, int k) {
	    int n = nums.length;
        int[] nums2 = new int[n];
        if(k > n){
        	k = k % n;
        }
        for(int i = 0; i < k; i++){
        	nums2[i] = nums[n - k + i];
        }
        for(int j = k; j < n; j++){
        	nums2[j] = nums[j - k];
        }
        System.arraycopy(nums2, 0, nums, 0, n);
    }

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		int k = 5;
		
		rotate(nums,k);
		System.out.print(Arrays.toString(nums));
	}

}
