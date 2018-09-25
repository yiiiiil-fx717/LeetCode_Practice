package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_093 {
	
	private static List<String> restoreIpAddresses(String s){
		List<String> result = new ArrayList<>();
		List<String> temp = new ArrayList<>();
		
		recursiveArray(s, result, temp, 0, 0);
		
		return result;
	}
	
	private static void recursiveArray(String address, List<String> result, List<String> temp, int current, int layer){
		final int length = address.length();
		
		if(current >= length || current < length - 3 * (4 - layer)){
			return;
		}
		if(layer == 3){
			if(!validateRange(address, current, length)){
				return;
			}
			temp.add(address.substring(current));
			result.add(String.join(".", temp));
			temp.remove(temp.size() - 1);
		}else{
			for(int i = 1; i <= 3; i++){
				int end = current + i <= address.length() ? current + i : address.length();
				if(validateRange(address, current, end) == false){
					continue;
				}
				temp.add(address.substring(current, end));
				recursiveArray(address, result, temp, current + i, layer + 1);
				temp.remove(temp.size() - 1);
			}
		}
	}
	
	private static boolean validateRange(String address, int current, int end){
		if(end - current > 1){
			if(address.charAt(current) == '0'){
				return false;
			}
		}
		int num = Integer.parseInt(address.substring(current, end));
		if(num >= 0 && num <= 255){
			return true;
		}
		return false;
	}
	
	public static void main(String args[]){
		String addressString = "255123146234";
		System.out.println(Arrays.toString((restoreIpAddresses(addressString)).toArray()));
	}
	
}
