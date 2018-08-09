package Leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Leetcode_207 {
	
	public static boolean canFinish1(int numCourses, int[][] prerequisites) {
        int[] count  = new int[numCourses];
        LinkedList<Integer> zeroSet = new LinkedList<Integer>();
        
        for(int i = 0; i < prerequisites.length; i++){
            count[prerequisites[i][0]]++;   //先统计各个结点的入度
        }
        for(int i = 0; i < count.length; i++){
            if(count[i] == 0) zeroSet.add(i);   //入度为0的结点放入可执行集合中
        }
        if(zeroSet.size() == 0) return false;   //若初始的可执行集合为空，则返回false
        
        int result = zeroSet.size();
        while(!zeroSet.isEmpty()){
            int x = zeroSet.remove();   //依次拿出可执行集合里的课程
            for(int i = 0;i < prerequisites.length; i++){
                if(prerequisites[i][1] == x){
                    count[prerequisites[i][0]]--;   //若有以其作为先导课程的课程，该课程的入度可以-1
                    if(count[prerequisites[i][0]] == 0){
                        result++;   //当一个课程的入度减为0是，他也可以放入可执行集合，并将可执行集合的长度++
                        zeroSet.add(prerequisites[i][0]);
                    }
                }
            }
        }
        return numCourses == result;   //判断是否所有课程都在可执行集合里，若是则可以列出题目所要求的课程列表
    }
	
	public static boolean canFinish2(int numCourses, int[][] prerequisites){
		int[] inDegreeArray = new int[numCourses];
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < prerequisites.length; i++){
			inDegreeArray[prerequisites[i][0]]++;
		}
		
		for(int i = 0; i < inDegreeArray.length; i++){
			if(inDegreeArray[i] == 0){
				stack.push(i);
			}
		}
		if(stack.isEmpty()) return false;
		
		int result = stack.size();
		while(!stack.empty()){
			int temp = stack.pop();
			
			for(int i = 0; i < prerequisites.length; i++){
				if(prerequisites[i][1] == temp){
					inDegreeArray[prerequisites[i][0]]--;
					
					if(inDegreeArray[prerequisites[i][0]] == 0){
						result++;
						stack.push(prerequisites[i][0]);
					}
				}
			}
		}
		return result == numCourses;
	}

	public static void main(String[] args) {
		int[][] prerequisites = {
				{1, 0}, {2, 1}
		};
		int numCourses = 3;
		System.out.println(canFinish1(numCourses, prerequisites));
		System.out.println(canFinish2(numCourses, prerequisites));
	}
}
