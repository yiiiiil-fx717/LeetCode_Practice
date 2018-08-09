package Leetcode;

public class Leetcode_240 {
	
	public static boolean searchMatrix1(int[][] matrix, int target){
		for(int i = 0; i < matrix.length; i++){
			
			for(int j = 0; j < matrix[i].length; j++){
				if(matrix[i][j] == target){
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean searchMatrix2(int[][] matrix, int target){
		int row = 0;
		int col = matrix[0].length - 1;
		
		while(row < matrix.length && col >= 0){
			final int temp = matrix[row][col];
			
			if(temp == target){
				return true;
			}else if(temp < target){
				row++;
			}else{
				col--;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] matrix = {
				{1,   4,  7, 11, 15},
				{2,   5,  8, 12, 19},
				{3,   6,  9, 16, 22},
				{10, 13, 14, 17, 24},
				{18, 21, 23, 26, 30}
		};
		int target = 33;
		System.out.println(searchMatrix1(matrix, target));
		System.out.println(searchMatrix2(matrix, target));
	}
}
