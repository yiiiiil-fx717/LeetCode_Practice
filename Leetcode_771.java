package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_771 {
	
	private static int numJewelsInStones1(String J, String S){
		int result = 0;
		
		for(int i = 0; i < S.length(); i++){
			for(int j = 0; j < J.length(); j++){
				if( Character.toString((S.charAt(i))).equals(Character.toString(J.charAt(j))) ){
					result += 1;
				}
			}
		}
		
		return result;
	}
	
	private static int numJewelsInStones2(String J, String S){
		int result = 0;
		
		Map<Character, Integer> map = new HashMap<>();
		char[] myStones = S.toCharArray();
		for(Character item : myStones){
			if(!map.containsKey(item)){
				int count = 0;
				map.put(item, count + 1);
			}else{
				int count = map.get(item);
				map.put(item, count + 1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		char[] jewels = J.toCharArray();
		for(Character item : jewels){
			if(map.containsKey(item)){
				result += map.get(item);
			}
		}
		
		return result;
	}
	
	public static void main(String args[]){
		String J = "aAb";
		String S = "aAAbbbb";
		System.out.println("Method one result: " + numJewelsInStones1(J, S));
		System.out.println("Method two result: " + numJewelsInStones2(J, S));
	}
}
