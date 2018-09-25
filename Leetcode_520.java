package Leetcode;

public class Leetcode_520 {
	
	private static boolean detectCapitalUse1(String word){
		if(word.length() < 2) return true;
		if(word.toUpperCase().equals(word)) return true;
		if(word.substring(1).toLowerCase().equals(word.substring(1))) return true;
		
		return false;
	}
	
	private static boolean detectCapitalUse2(String word){
		return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
	}
	
	public static void main(String args[]){
		String word = "USA";
		System.out.println(detectCapitalUse1(word));
		System.out.println(detectCapitalUse2(word));
	}
}
