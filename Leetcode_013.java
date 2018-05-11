package Leetcode;

public class Leetcode_013 {
	public int romanToInt(String s) {
        int number = toInteger(s.charAt(0));
        
        for(int i = 1; i < s.length(); i++){
            int prev = toInteger(s.charAt(i - 1));
            int curr = toInteger(s.charAt(i));
            
            if(curr <= prev){
                number += curr;
            }else{
                number = number - prev * 2 + curr;
            }
        }
        return number;
    }
    
    private int toInteger(char string){
        int data = 0;
        
        switch(string){
            case 'I':
                data = 1;
                break;
            case 'V':
                data = 5;
                break;
            case 'X':
                data = 10;
                break;
            case 'L':
                data = 50;
                break;
            case 'C':
                data = 100;
                break;
            case 'D':
                data = 500;
                break;
            case 'M':
                data = 1000;
                break;
        }
        return data;
    }
}
