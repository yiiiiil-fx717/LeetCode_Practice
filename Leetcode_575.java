package Leetcode;

import java.util.Arrays;

public class Leetcode_575 {
	
	public static int distribute(int[] candies){
		int max = 1;
		Arrays.sort(candies);
		for(int i = 1; i < candies.length && max < candies.length/2; i++){
			if(candies[i] > candies[i - 1]){
				max++;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] candies = {1,1,2,3,4,4,5,5};
		System.out.println(distribute(candies));

	}

}
