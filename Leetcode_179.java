package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Leetcode_179 {
	
	public static String largestNumber(int[] nums){
		String[] stringArray = new String[nums.length];
		if(nums.length == 0 || nums == null){
			return "0";
		}
		for(int i = 0; i < nums.length; i++){
			stringArray[i] = String.valueOf(nums[i]);
		}
		
		Arrays.sort(stringArray, new CompareString());
		if(stringArray[0].equals("0")){
            return "0";
        }
		
		String result = "";
		for(String item : stringArray){
			result += item;
		}
		return result;
	}
	
	private static class CompareString implements Comparator<String>{
		@Override
		public int compare(String s1, String s2){
			String str1 = s1 + s2;
			String str2 = s2 + s1;
			return str2.compareTo(str1);
		}
	}

	public static void main(String[] args) {
		int[] nums = {10, 2};
		System.out.println(largestNumber(nums));
	}
}
