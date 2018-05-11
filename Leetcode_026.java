package Leetcode;
import java.util.Arrays;

public class Leetcode_026 {
	
/*	static int removeDuplicates(int[] nums){
		if(nums.length == 0 || nums.length == 1){
			return nums.length;
		}
		boolean flag = true;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != nums[0]){
				flag = false;
			}
		}
		if(flag){
			return 1;
		}
		
		int index = 0;
		for(int i = 0; i < nums.length - 1; i++){
			if(nums[i] != nums[i + 1]){
				nums[index] = nums[i];
				index++;
			}
		}
		if(nums[nums.length - 1] != nums[nums.length - 2]){
			nums[index] = nums[nums.length - 1];
			index++;
		}else{
			index++;
		}
		return index;
	}
*/
	static int removeDuplicates(int[] nums){
		int index = 1;
		for(int i = 1; i < nums.length ; i++){   
			if(nums[i] != nums[index - 1]){
				nums[index] = nums[i];
				index++;
			}
		}
		return index;
}
	
	public static void main(String[] args) {
		int[] nums = {1,1,2,2,3,3};
		System.out.print(removeDuplicates(nums));
		System.out.print(Arrays.toString(nums));
	}

}


