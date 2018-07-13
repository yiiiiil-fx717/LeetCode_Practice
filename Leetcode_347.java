package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Leetcode_347 {
	
	public static List<Integer> topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        //put each unique number into hashmap and its corresponding frequency
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num, 0);
            }else{
                map.put(num, map.get(num) + 1);
            }
        }
        
        //sort key value pairs in hashmap based on value
        List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return (o2.getValue() - o1.getValue());
			}
		});
        
        List<Integer> result = new ArrayList<Integer>();
        for(Entry<Integer, Integer> temp : list){
            if(k == 0){
                break;
            }else{
                result.add(temp.getKey());
                k--;
            }
        }
        return result;
    }

	public static void main(String[] args) {
		int[] array = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5};
		int k = 3;
		System.out.println(topKFrequent(array, k));
	}

}
