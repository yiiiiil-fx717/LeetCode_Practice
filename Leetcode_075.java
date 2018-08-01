package Leetcode;

public class Leetcode_075 {
	public static void sortColors(int[] nums) {
        int red = 0;     //0
        int white = 0;   //1
        int blue = 0;    //2
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                red += 1;
            }else if(nums[i] == 1){
                white += 1;
            }else if(nums[i] == 2){
                blue += 1;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(j < red){
                nums[j] = 0;
            }else if(j < red + white && j >= red){
                nums[j] = 1;
            }else if(j <= nums.length - 1 && j >= red + white){
                nums[j] = 2;
            }
        }
    }
}
