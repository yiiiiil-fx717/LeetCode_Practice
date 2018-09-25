package Leetcode;

public class Leetcode_738 {
	
	private static int monotoneIncreasingDigits(int number){
		if(number == 0) return 0;
		
		char[] temp = Integer.toString(number).toCharArray();
		int begin = temp.length;
		for(int i = temp.length - 1; i >= 1; i--){
			if(temp[i] >= temp[i - 1]){
				continue;
			}else{
				temp[i - 1]--;
				begin = i;
			}
		}
		
		for(int i = begin; i < temp.length; i++){
			temp[i] = '9';
		}
		
		return Integer.parseInt(String.valueOf(temp));
	}
	
	public static void main(String args[]){
		int number = (int) (0 + Math.random() * (Math.pow(10, 9) - 0 + 1));
		
		System.out.println(monotoneIncreasingDigits(number));
	}
}
