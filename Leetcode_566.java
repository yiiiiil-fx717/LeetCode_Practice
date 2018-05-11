package Leetcode;
import java.util.Arrays;

public class Leetcode_566 {
	
	public static int[][] matrixReshape(int[][] nums, int r, int c){
		int element = 0;
		for(int i = 0; i < nums.length; i++){
			element = nums[i].length + element;
		}
		if(r * c != element){
			return nums;
		}else{
			int[][] arr = new int[r][c];
			for(int i = 0; i < r; i++){
				for(int j = 0; j < c; j++){
					for(int m = 0; m < nums.length; m++){
						for(int n = 0; n < nums[m].length; n++){
							if(i * c + j + 1 == m * nums[m].length + n + 1){
								arr[i][j] = nums[m][n];
							}
						}
					}
				}
			}
			for(int i = 0; i < r; i++){
					System.out.println(Arrays.toString(arr[i]));
			}
			return arr;
		}
		
	}

	public static void main(String[] args) {
		int[][] nums = {
				{1,2},
				{3,4}
		};
		int r = 1;
		int c = 4;
		int[][] arr = new int[r][c];
		matrixReshape(nums,r,c);
	}

}
