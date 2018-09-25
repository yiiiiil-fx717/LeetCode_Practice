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

public class Leetcode_701 {
	public TreeNode insertIntoBST(TreeNode root, int val) {
        return insertNode(root, val);
    }
    
    private static TreeNode insertNode(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }else if(val < root.val){
            root.left = insertNode(root.left, val);
        }else if(val > root.val){
            root.right = insertNode(root.right, val);
        }else{
            return root;
        }
        
        return root;
    }
}
