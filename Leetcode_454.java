package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_454 {
	
	public static int fourSumCount1(int[] A, int[] B, int[] C, int[] D) {
        int result = 0;
        
        if(A.length == 0 & B.length == 0 && C.length == 0 && D.length == 0){
        	return result;
        }
        
        List<Integer> list1 = new ArrayList<Integer>();
        for(int i = 0; i < A.length; i++){
        	for(int j = 0; j < B.length; j++){
        		list1.add(A[i] + B[j]);
        	}
        }
        
        List<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0; i < C.length; i++){
        	for(int j = 0; j < D.length; j++){
        		list2.add(C[i] + D[j]);
        	}
        }
        
        for(Integer part1 : list1){
        	for(Integer part2 : list2){
        		if((part1 + part2) == 0){
        			result += 1;
        		}
        	}
        }
		return result;
    }
	
	public static int fourSumCount2(int[] A, int[] B, int[] C, int[] D){
		Map<Integer, Integer> map = new HashMap<>();
		int result = 0;
		
		for(int i = 0; i < C.length; i++){
			for(int j = 0; j < D.length; j++){
				int sum = C[i] + D[j];
				map.put(sum, map.getOrDefault(sum, 0) + 1);
			}
		}
		
		for(int i = 0; i < A.length; i++){
			for(int j = 0; j < B.length; j++){
				result += map.getOrDefault(-1 * (A[i] + B[j]), 0);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 1, -1, -2};
		int[] nums2 = {-2, -1, 2, 1, -1};
		int[] nums3 = {-1, 2, -1, -1, 1};
		int[] nums4 = {0, 2, 1, 1, -1};
		System.out.println(fourSumCount1(nums1, nums2, nums3, nums4));
		System.out.println(fourSumCount2(nums1, nums2, nums3, nums4));
	}
}
