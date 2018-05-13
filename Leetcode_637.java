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
public class Leetcode_637 {
	public List<Double> averageOfLevels(TreeNode root) {
        List<Double> output = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            double sum = 0;
            
            for(int i = 0; i < count; i++){
                TreeNode current = queue.poll();
                sum += current.val;
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
            output.add(sum / count);
        }
        return output;
    }
}
