package Leetcode;

public class Leetcode_062 {
	public int uniquePaths(int m, int n) {
        int[][] map = new int[n][m];
        for(int i = 0; i < m; i++){
            map[0][i] = 1;
        }
        for(int j = 0; j < n; j++){
            map[j][0] = 1;
        }
        
        for(int k = 1; k < n; k++){
            for(int l = 1; l < m; l++){
                map[k][l] = map[k][l - 1] + map[k -1][l];
            }
        }
        return map[n - 1][m - 1];
    }
}
