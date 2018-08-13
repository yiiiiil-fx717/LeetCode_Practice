package Leetcode;

import java.util.LinkedList;
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
public class Leetcode_226 {
	public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            TreeNode swap = current.right;
            current.right = current.left;
            current.left = swap;
            
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
        }
        return root;
    }
}
