package Leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Leetcode_653 {
	public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        int target = k;
        Queue<TreeNode> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            if(set.contains(target - current.val)){
                return true;
            }else{
                set.add(current.val);
            }
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
        }
        return false;
    }
}
