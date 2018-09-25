package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_279 {
	
	/* Brute Force */
	private static int numSquares1(int number){
		int result = 0;
		List<Integer> squareNumber = new ArrayList<>();
		
		for(int i = 1; i <= number; i++){
			if(isSquareNumber(i)){
				squareNumber.add(i);
			}else{
				continue;
			}
		}
		List<List<Integer>> allCombinations = findAllCombination(squareNumber, number);
		result = allCombinations.get(0).size();
		for(List<Integer> item : allCombinations){
			if(item.size() < result){
				result = item.size();
			}
		}
		
		return result;
	}
	
	private static List<List<Integer>> findAllCombination(List<Integer> squareNumber, int target){
		List<List<Integer>> result = new ArrayList<>();
        
        for(int item : squareNumber){
        	if(target == item){
        		List<Integer> temp = new ArrayList<>();
        		temp.add(item);
        		result.add(temp);
        	}else if(target > item){
        		for(List<Integer> temp : findAllCombination(squareNumber, target - item)){
        			temp.add(item);
        			temp.sort((a, b) -> a - b);
        			if(!result.contains(temp)){
        				result.add(temp);
        			}
        		}
        	}
        }
        
        return result;
	}
	
	private static boolean isSquareNumber(int number){
		int temp = (int) Math.sqrt(number);
		return Math.pow(temp, 2) == number;
	}
	
	private static int numSquares2(int number){
		int[] array = new int[number + 1];
		Arrays.fill(array, Integer.MAX_VALUE);
		array[1] = 1;
		
		for(int i = 2; i <= number; i++){
			int sqrt = (int) Math.sqrt(i);
			if(Math.pow(sqrt, 2) == i){
				array[i] = 1;
			}else{
				for(int j = 1; j <= i / 2; j++){
					array[i] = Math.min(array[j] + array[i - j], array[i]);
				}
			}
		}
		return array[number];
	}
	
	public static void main(String args[]){
		int number = 12;
		
		if(number > 30){
			System.out.println(numSquares2(number));
		}else{
			System.out.println(numSquares1(number));
			System.out.println(numSquares2(number));
		}
	}
}
