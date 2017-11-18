
public class leetcode104_Maxinum_Depth_of_binary_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int maxDepth(TreeNode root) {
	     
		 if (root == null){
			 return 0;
		 }
		 
		 return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
		 
	 }

}
