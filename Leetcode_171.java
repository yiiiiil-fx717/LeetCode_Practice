package Leetcode;

public class Leetcode_171 {
	public int titleToNumber(String s) {
        int result = 0;
        char[] strArray = s.toCharArray();
        
        for(int i = 0; i < s.length(); i++){
            result = result * 26 + strArray[i] - 'A' + 1;
            System.out.println(strArray[i] - 'A');
        }
        return result;
    }
}
