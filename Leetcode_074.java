package Leetcode;

public class Leetcode_074 {
	
	public static boolean searchMatrix(int[][] matrix, int target){
		if(matrix == null || matrix.length == 0) return false;
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
		int target = 1;
		int[][] matrix = {
				{1,   3,  5,  7},
				{10, 11, 16, 20},
				{23, 30, 34, 50}	
		};
		System.out.println(searchMatrix(matrix, target));
	}
}
