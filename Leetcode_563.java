package Leetcode;

public class Leetcode_563 {
int result = 0;
    
    public int findTilt(TreeNode root) {
        method(root);
        return result;
    }
    
    private int method(TreeNode root){
        if(root == null) return 0;
        
        int left = method(root.left);
        int right = method(root.right);
        result += Math.abs(left - right);
        return left + right + root.val;
    }
}
