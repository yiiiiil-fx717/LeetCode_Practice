package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Leetcode_905 {
	
	private static int[] sortArrayByParity1(int[] A){
		int[] result = new int[A.length];
        List<Integer> oddNum = new ArrayList<>();
        List<Integer> evenNum = new ArrayList<>();
        
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                evenNum.add(A[i]);
            }else{
                oddNum.add(A[i]);
            }
        }
        
        evenNum.addAll(oddNum);
        convertObjectArrayToIntArray(evenNum, result);
        
        return result;
	}
	
	private static int[] convertObjectArrayToIntArray(List<Integer> list, int[] result){
		Iterator<Integer> iterator = list.iterator();
		
		for(int i = 0; i < result.length; i++){
			result[i] = (int) iterator.next();
		}
		
		return result;
	}
	
	// O(nlogn)
	private static int[] sortArrayByParity2(int[] A){
		Integer[] B = new Integer[A.length];
		
		for(int i = 0; i < A.length; i++){
			B[i] = (int) A[i];
		}
		
		Arrays.sort(B, (a, b) -> Integer.compare(a % 2, b % 2));
		
		A = Arrays.stream(B).mapToInt(Integer::valueOf).toArray();
		
		return A;
	}
	
	// O(n)
	private static int[] sortArrayByParity3(int[] A){
		int[] result = new int[A.length];
		int j = 0;
		
		for(int i = 0; i < A.length; i++){
			if(A[i] % 2 == 0){
				result[j] = A[i];
				j++;
			}
		}
		
		for(int i = 0; i < A.length; i++){
			if(A[i] % 2 == 1){
				result[j] = A[i];
				j++;
			}
		}
		
		return result;
	}
	
	//O(n)
	private static int[] sortArrayByParity4(int[] A){
		int i = 0, j = A.length - 1;
		
		while(i < j){
			if(A[i] % 2 > A[j] % 2){
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
			
			if(A[i] % 2 == 0) i++;
			if(A[j] % 2 == 1) j--;
		}
		
		return A;
	}
	
	public static void main(String args[]){
		int[] array = {3, 1, 2, 4, 6, 16, 13, 5, 9, 2};
		System.out.println(Arrays.toString(sortArrayByParity1(array)));
		System.out.println(Arrays.toString(sortArrayByParity2(array)));
		System.out.println(Arrays.toString(sortArrayByParity3(array)));
		System.out.println(Arrays.toString(sortArrayByParity4(array)));
	}
}
