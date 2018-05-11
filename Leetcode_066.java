package Leetcode;
import java.util.Arrays;

public class Leetcode_066 {
	
	static int[] plusOne(int[] digits){
		boolean flag = true;
		for(int j = digits.length - 1; j >= 0; j--){
			if(digits[j] == 9){
				digits[j] = 0;
			}else{
				digits[j] = digits[j] + 1;
				flag = false;
				break;
			}
		}
		
		if(flag){
			int[] arr = new int[digits.length + 1];
			arr[0] = 1;
			return arr;
		}else{
			return digits;
		}
	}

	static int[] plusOne2(int[] digits){
		for(int j = digits.length - 1; j >= 0; j--){
			if(digits[j] == 9){
				digits[j] = 0;
			}else{
				digits[j] = digits[j] + 1;
				return digits;
			}
		}
		int[] arr = new int[digits.length + 1];
		arr[0] = 1;
		return arr;
	}
	
	
	public static void main(String[] args) {
		int[] digits = {9,9,9};
		System.out.print(Arrays.toString(plusOne2(digits)));
	}

}
