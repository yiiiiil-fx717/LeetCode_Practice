package Leetcode;

public class Leetcode_389 {
	
	private static char findTheDifference(String s, String t){
		char[] sarray = s.toCharArray();
		char[] tarray = t.toCharArray();
		
		int[] hash = new int[26];
		for(int i = 0; i < sarray.length; i++){
			int index = sarray[i] - 'a';
			hash[index]++;
		}
		
		for(int i = 0; i < tarray.length; i++){
			int index = tarray[i] - 'a';
			hash[index]--;
			if(hash[index] < 0){
				return (char) ((char) index + 'a');
			}
		}
		
		return '-';
	}
	
	public static void main(String args[]){
		String s = "abcd";
		String t = "abcde";
		System.out.println(findTheDifference(s, t));
	}
}
