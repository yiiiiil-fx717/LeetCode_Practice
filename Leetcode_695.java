package Leetcode;

public class Leetcode_695 {
	boolean[][] seen;
    int[][] grid;

public int maxAreaOfIsland(int[][] grid) {
    this.grid = grid;
    int flag = 0;
    seen = new boolean[grid.length][grid[0].length];
    for(int i = 0; i < grid.length; i++){
        for(int j = 0; j < grid[0].length; j++){
            flag = Math.max(flag, findArea(i, j));
        }
    }
    return flag;
}

private int findArea(int i, int j){
    if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || seen[i][j] || grid[i][j] == 0){
        return 0;
    }
    seen[i][j] = true;
    return (1 + findArea(i - 1, j) + findArea(i + 1, j) + findArea(i, j - 1) + findArea(i, j + 1));
}
}
