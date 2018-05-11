package Leetcode;

public class Leetcode_520 {
	
	public static boolean detectCapitalUse(String word){
		if(word.length() <= 1) return true;
		char firstChar  = word.charAt(0);
		char secondChar = word.charAt(1);
		if(Character.isLowerCase(firstChar) || (Character.isUpperCase(firstChar) && Character.isLowerCase(secondChar))){
			for(int i = 2; i < word.length(); i++){
				char current = word.charAt(i);
				if(Character.isUpperCase(current)){
					return false;
				}else if( Character.isUpperCase(firstChar) || (Character.isUpperCase(firstChar) && Character.isUpperCase(secondChar))){
					for(int j = 2; j < word.length(); j++){
						char curr = word.charAt(j);
						if(Character.isLowerCase(curr)){
							return false;
						}
					}
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String input = "USa";
		System.out.println(detectCapitalUse(input));
	}

}
