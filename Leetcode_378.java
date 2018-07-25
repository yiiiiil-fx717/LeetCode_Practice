package Leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Leetcode_378 {
	
	public static int kthSmallest1(int[][] matrix, int k){
		int length = matrix.length;
		int[] array = new int[length * length];
		int n = length;
		
		for(int i = 0; i < length; i++){
			
			for(int j = 0; j < length; j++){
				array[n * i + j] = matrix[i][j];
			}
		}
		Arrays.sort(array);
		return array[k - 1];
	}
	
	static class CompareNode implements Comparator<Integer>{
		public int compare(Integer i1, Integer i2){
			return i2.compareTo(i1);
		}
	}
	
	public static int kthSmallest2(int[][] matrix, int k){
		/*PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
		public int compare(Integer i1, Integer i2){
			//return i1.compareTo(i2);
			return i2 - i1;
		}
		});
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k, (a, b) -> b - a);
		Comparator<Integer> cmp = (a, b) -> {return a - b;};
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k, cmp);*/
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k, new CompareNode());
		int length = matrix.length;
		
		for(int i = 0; i < length; i++){
			
			for(int j = 0; j < length; j++){
				
				if(queue.size() < k){
					queue.offer(matrix[i][j]);
				}else{
					if(matrix[i][j] > queue.peek()){
						break;
					}else{
						queue.poll();
						queue.offer(matrix[i][j]);
					}
				}
			}
		}
		return queue.peek();
	}

	public static void main(String[] args) {
		int[][] matrix = {
				{1, 5, 9},
				{10, 11, 13},
				{12, 13, 15},
		};
		int target = 2;
		System.out.println(kthSmallest2(matrix, target));
	}
}
