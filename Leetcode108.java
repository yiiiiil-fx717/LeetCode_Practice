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
public class Leetcode108 {
	public TreeNode sortedArrayToBST(int[] nums) {        
        return method(nums, 0, nums.length - 1);
    }
    
    private TreeNode method(int[] nums, int beginIdx, int endIdx){
        if(beginIdx > endIdx) return null;
        int midIdx = (beginIdx + endIdx + 1) / 2;
        TreeNode root = new TreeNode(nums[midIdx]);
        if(beginIdx == endIdx) return root;
        root.left = method(nums, beginIdx, midIdx - 1);
        root.right = method(nums, midIdx + 1, endIdx);
        return root;
    }
}
