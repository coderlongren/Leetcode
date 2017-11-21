import javax.swing.tree.TreeNode;


public class leetcode129_Sum_root_leaf_sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode rootNode = new TreeNode(1);
		rootNode.left = new TreeNode(1);
		rootNode.right = new TreeNode(2);
		
		
		System.out.println(sum_root_leaf_sum(rootNode));
	}
	
	public static int sum_root_leaf_sum(TreeNode root){
		
		return dfs(root,0);
	}
	// 深度优先搜索
	private static int dfs(TreeNode root, int sum) {
		if (root == null){
			return 0;
		}
		if (root.left == null && root.right == null){
			return sum*10 + root.val;
		}
		return dfs(root.left, sum*10 + root.val) + dfs(root.right, sum*10 + root.val);
	}

	public static class TreeNode{
		public int val;
		public TreeNode left;
		public TreeNode right;
		public TreeNode(int val){
			this.val = val;
		}
	}
	

}
