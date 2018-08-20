package Leetcode;

import java.util.Arrays;

public class Leetcode_867 {
	
	public static int[][] transpose(int[][] matrix){
		int row = matrix.length;
		int col = matrix[0].length;
		int[][] result = new int[col][row];
		
		for(int i = 0; i < col; i++){
			for(int j = 0; j < row; j++){
				result[i][j] = matrix[j][i];
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[][] matrix = {
				{5},
				{8}
		};
		System.out.println(Arrays.deepToString(transpose(matrix)));
	}
}
