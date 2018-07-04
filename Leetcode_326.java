package Leetcode;

public class Leetcode_326 {
	public boolean isPowerOfThree(int n) {
        if(n < 1) return false;
        
        while(n % 3 == 0){
            n /= 3;
        }
        
        return n == 1;
    }
}
