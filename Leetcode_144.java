package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Leetcode_144 {
	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        method(root, list);
        return list;
    }
    
    private void method(TreeNode root, List<Integer> list){
        if(root != null){
            list.add(root.val);
            
            if(root.left != null){
                method(root.left, list);
            }
            
            if(root.right != null){
                method(root.right, list);
            }
        }
    }
}
