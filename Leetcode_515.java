package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Leetcode_515 {
	public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> output = new ArrayList<>();
        if(root == null) return output;
        
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            int rowMax = Integer.MIN_VALUE;
            
            for(int i = 0; i < count; i++){
                TreeNode current = queue.poll();
                rowMax = Math.max(current.val, rowMax);
                
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
            output.add(rowMax);
        }
        return output;
    }
}
