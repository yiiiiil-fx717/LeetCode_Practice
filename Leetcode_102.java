package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Leetcode_102 {
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        solution(list, root, 0);
        return list;
    }
    
    private void solution(List<List<Integer>> list, TreeNode root, int level){
        if(root == null) return;
        
        //number of level same as number of element
        if(list.size() == level){
            list.add(new ArrayList<>());
        }
        
        list.get(level).add(root.val);
        solution(list, root.left, level + 1);
        solution(list, root.right, level + 1);
    }
}
