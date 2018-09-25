package Leetcode;

import java.util.Arrays;

public class Leetcode_338 {
	
	private static int[] countBits(int num){
		int[] result = new int[num + 1];
		
		for(int i = 0; i < result.length; i++){
			result[i] = Integer.bitCount(i);
		}
		
		return result;
	}
	
	public static void main(String args[]){
		int num = 2;
		System.out.println(Arrays.toString(countBits(num)));
	}
}
