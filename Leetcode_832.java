package Leetcode;

public class Leetcode_832 {
	public int[][] flipAndInvertImage(int[][] A) {
        for(int row = 0; row < A.length; row++){
            for(int col = 0; col < A[row].length / 2; col++){
                int temp = A[row][col];
                A[row][col] = A[row][A[row].length - col - 1];
                A[row][A[0].length - col - 1] = temp;
            }
        }
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                if(A[i][j] == 0){
                    A[i][j] = 1;
                }else if(A[i][j] == 1){
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }
}
