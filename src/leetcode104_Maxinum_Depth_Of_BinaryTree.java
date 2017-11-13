public class leetcode104_Maxinum_Depth_Of_BinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int maxDepth(TreeNode root) {
		if (root == null){
			return 0;
		}
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
		//三元运算符计算 深度
		return leftDepth > rightDepth? leftDepth + 1 : rightDepth + 1;
		
	}
	
	public static class TreeNode{
		public  int val;
		public TreeNode left;
		public TreeNode right;
		
		public TreeNode(int val){
			this.val = val;
		}
	} 

}
