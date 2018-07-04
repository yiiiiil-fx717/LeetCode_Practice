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
public class Leetcode_101 {
	public boolean isSymmetric(TreeNode root) {
        return solution(root, root);
    }
    
    public boolean solution(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;
        
        return (t1.val == t2.val) && solution(t1.right, t2.left) && solution(t1.left, t2.right);
    }
}
