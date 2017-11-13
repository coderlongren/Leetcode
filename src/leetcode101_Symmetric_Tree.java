
public class leetcode101_Symmetric_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public  static boolean isSymmetric(TreeNode root) {
		if (root == null){
			return true;
		}
		return test(root.left, root.right);
		
		
    }
	public static boolean test(TreeNode leftNode,TreeNode rightNode){
		if (leftNode == null && rightNode == null){
			return true;
		}
		if (leftNode == null || rightNode == null){
			return false;
		}
		if (leftNode.val != rightNode.val){
			return false;
		}
		return test(leftNode.left, rightNode.right) && test(leftNode.right, rightNode.left);
		
	}


	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	}
}
