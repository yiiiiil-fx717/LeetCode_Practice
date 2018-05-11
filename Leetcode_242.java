package Leetcode;

import java.util.Arrays;

public class Leetcode_242 {
	
	public static boolean isAnagram(String s, String t) {
        String sortedS = sortString(s);
        String sortedT = sortString(t);
        System.out.println(sortedS);
        System.out.println(sortedT);
        
        int pointer1 = 0;
        int pointer2 = 0;
        
        while(pointer1 < sortedS.length() && pointer2 < sortedT.length()){
            if(sortedS.charAt(pointer1) == sortedT.charAt(pointer2)){
                pointer1++;
                pointer2++;
            }else{
                return false;
            }
        }
        return true;
    }
    
    private static String sortString(String string){
        char[] array = string.toCharArray();   
        Arrays.sort(array);
        String sortedString = Arrays.toString(array);
        return sortedString;
    }

	public static void main(String[] args) {
		String string1 = "";
		String string2 = "";
		System.out.print(isAnagram(string1, string2));
		
	}

}
