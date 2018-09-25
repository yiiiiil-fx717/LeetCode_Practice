package Leetcode;

public class Leetcode_700 {
	public TreeNode searchBST(TreeNode root, int val) {
        while(root != null && root.val != val){
            root = root.val > val ? root.left : root.right;
        }
        return root;
    }
}
