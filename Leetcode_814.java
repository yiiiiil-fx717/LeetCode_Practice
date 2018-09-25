package Leetcode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Leetcode_814 {
	public TreeNode pruneTree(TreeNode root) {
        if(root == null) return null;
        
        if(root.left != null){
            root.left = pruneTree(root.left);
        }
        
        if(root.right != null){
            root.right = pruneTree(root.right);
        }
        
        if(root.left == null && root.right == null && root.val == 0){
            return null;
        }
        
        return root;
    }
}
