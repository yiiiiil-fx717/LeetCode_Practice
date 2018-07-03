package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_119 {
	public List<Integer> getRow(int rowIndex) {
        int totalRows = rowIndex + 1;
        return generate(rowIndex, totalRows);
    }
    
    public List<Integer> generate(int rowIndex, int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
    
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
        return list.get(rowIndex);
    }
}
