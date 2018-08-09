package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_049 {
	
	public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs.length == 0 || strs == null){
            return result;
        }
        
        Map<String, List<String>> map = new HashMap<>();
        String element = "";
        for(int i = 0; i < strs.length; i++){
        	element = strs[i];
        	char[] charArray = element.toCharArray();
        	Arrays.sort(charArray);   
        	element = new String(charArray);
        	
        	if(map.containsKey(element)){
        		map.get(element).add(strs[i]);
        	}else{
        		List<String> temp = new ArrayList<>();
        		temp.add(strs[i]);
        		map.put(element, temp);
        	}
        }
        
        for(List<String> item : map.values()){
        	result.add(item);
        }
        
        return result;
    }

	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(strs));
	}
}
