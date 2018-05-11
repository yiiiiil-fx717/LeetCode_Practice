package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_003 {
	public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int count = 0;
        int i = 0;
        int j = 0;
        int n = s.length();
        
        while(i < n && j < n){
            if(! set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                count = Math.max(count, set.size());
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return count;
    }
}
