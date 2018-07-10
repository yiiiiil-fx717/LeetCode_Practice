package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P_DuplicateNumber {
	static String solution(int[] arr) {
      Set<Integer> set = new HashSet<Integer>();
      Set<Integer> set2 = new HashSet<Integer>();
      List<Integer> lst = new ArrayList<Integer>();
      
      for (int v : arr) {
        if (set.contains(v)) {
          set2.add(v);
        } else {
          set.add(v);
        }
      }
      
      for (Integer v : set2) {
        lst.add(v);
      }
      Collections.sort(lst, (a, b) -> a - b);
      
      String[] strs = new String[lst.size()];
      for (int i = 0; i < lst.size(); ++i) {
        strs[i] = lst.get(i).toString();
      }
      
      return String.join(" ", strs);
    }
}
