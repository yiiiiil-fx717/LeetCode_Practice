package Leetcode;

public class Leetcode_048 {
	public void rotate(int[][] matrix) {
        int length = matrix.length;
        for(int i = 0; i < length; i++){
            for(int j = 0; j <= i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0, j = length - 1; i < j; i++, j--){
            for(int k = 0; k < length; k++){
                int temp = matrix[k][i];
                matrix[k][i] = matrix[k][j];
                matrix[k][j] = temp;
            }
        }
    }
}
