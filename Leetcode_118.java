package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_118 {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        if(numRows == 0){
            return list;
        }
        
        list.add(new ArrayList<>());
        list.get(0).add(1);
        
        for(int i = 1; i < numRows; i++){
            List<Integer> eachRow = new ArrayList<Integer>();
            List<Integer> lastRow = list.get(i - 1);
            
            eachRow.add(1);
            for(int j = 1; j < i; j++){
                eachRow.add(lastRow.get(j - 1) + lastRow.get(j));
            }
            eachRow.add(1);
            list.add(eachRow);
        }
        return list;
    }
}
