package Leetcode;


public class Leetcode_449 {
	/* Runtime Error
	public int index = -1;

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if(root == null){
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val + ",");
        sb.append(serialize(root.left));
        sb.append(serialize(root.right));
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        index++;
        String[] sequence = data.split(",");
        TreeNode leaf = null;
        while(!sequence[index].equals("#")){
            leaf = new TreeNode(Integer.valueOf(sequence[index]));
            leaf.left = deserialize(data);
            leaf.right = deserialize(data);
        }
        return leaf;
    }
    */
	
	class TreeNode{
		int val;
		
		TreeNode left;
		TreeNode right;
		
		TreeNode(int x){
			val = x;
		}
	}
    
	public int index = 0;
    
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if(root == null){
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val + ",");
        serialize(root.left, sb);
        serialize(root.right, sb);
        return sb.toString();
    }
    
    private void serialize(TreeNode root, StringBuilder sb) {
        if(root == null){
            sb.append("#,");
            return;
        }
        sb.append(root.val + ",");
        serialize(root.left, sb);
        serialize(root.right, sb);
    }
    
    public TreeNode deserialize(String data) {
        String[] sequence = data.split(",");
        if (sequence[0].equals("#")){
            return null;
        }
        TreeNode root = new TreeNode(
            Integer.parseInt(sequence[0])
        );
        ++index;
        deserialize(root, sequence);
        return root;
    }
    
    private void deserialize(TreeNode root, String[] sequence){
        if (sequence[index].equals("#")){
            root.left = null;
            ++index;
        }else{
            root.left = new TreeNode(Integer.parseInt(sequence[index]));
            ++index;
            deserialize(root.left, sequence);
        }
        if(sequence[index].equals("#")){
            root.right = null;
            ++index;
        }else{
            root.right = new TreeNode(Integer.parseInt(sequence[index]));
            ++index;
            deserialize(root.right, sequence);
        }
    }
}
