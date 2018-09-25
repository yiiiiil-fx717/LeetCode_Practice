package Leetcode;

public class Leetcode_461 {
	
	private static int hammingDistance(int x, int y){
		return Integer.bitCount(x ^ y);
	}
	
	public static void main(String args[]){
		int x = 1, y = 4;
		System.out.println(hammingDistance(x, y));
	}
}
