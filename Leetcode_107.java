package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode_107 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        
        Queue<TreeNode> level = new LinkedList<>();
        level.add(root);
        
        while(!level.isEmpty()){
            int levelSize = level.size();
            if(levelSize == 0) break;
            
            List<Integer> temp = new ArrayList<>();
            while(levelSize > 0){
                TreeNode node = level.remove();
                temp.add(node.val);

                if(node.left != null){
                    level.add(node.left);
                }

                if(node.right != null){
                    level.add(node.right);
                }
                
                levelSize--;
            }
            result.add(temp);
        }
        Collections.reverse(result);
        
        return result;
    }
}
