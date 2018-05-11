package Leetcode;

public class Leetcode_007 {
        
	public static int reverse(int x) {
        long rev= 0;
        
        while( x != 0){
            rev= rev * 10 + x % 10;
            x= x / 10;
            
            if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }
        
        return (int) rev;
    }

	public static void main(String[] args) {
		System.out.println(reverse(123213));
		System.out.println(7 / 2);
	}

}
