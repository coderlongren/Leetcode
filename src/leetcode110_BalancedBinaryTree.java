
public class leetcode110_BalancedBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(2);
		root.left = null;
		root.right = null;
		System.out.println(isBalanced(root));
	}
	// 平衡二叉树的 判断 
	 public static boolean isBalanced(TreeNode root) {
	      
		 //如果 为null 满足 AVL condition
		if (root == null){
			return true;
		}
		int result = height(root);
		 return result != -1;
	 }
	 
	 public static  int height(TreeNode node){
		 	if (node == null){
		 		return 0;
		 	}
		 	int HL = height(node.left);
		 	if (HL == -1){
		 		return -1;
		 	}
		 	int HR = height(node.right);
		 	if (HR == -1){
		 		return -1;
		 	}
		 	if (Math.abs(HR - HL) > 1){
		 		return -1;
		 	}
		 	// 得到 子树高度 +1 返回
		 return Math.max(HR, HL) + 1;
		 
	 }
	
	
	
    public static class TreeNode {
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int x) { val = x; }
    }

}
