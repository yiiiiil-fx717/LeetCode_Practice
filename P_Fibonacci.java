package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class P_Fibonacci {
	
	static List<Integer> fibonacci(int n) {
      List<Integer> arr = new ArrayList<Integer>();
      if (n < 1) {
        return arr;
      }
      arr.add(0);
      if (n < 2) {
        return arr;
      }
      arr.add(1);
      for (int i = 2; i < n; i += 1) {
        arr.add(arr.get(i - 1) + arr.get(i - 2));
      }
      return arr;
	}
}
