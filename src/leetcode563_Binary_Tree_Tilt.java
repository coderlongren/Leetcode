
public class leetcode563_Binary_Tree_Tilt {
	static int result = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int findTilt(TreeNode root) {
		find(root);
		return result;
    }
	public static int find(TreeNode node){
		if (node == null){
			return 0;
		}
		int left = find(node.left);
		int right = find(node.right);
		result += Math.abs(left - right);
		return left + right + node.val;
	}

	 public static class TreeNode{
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x){
			 this.val = x;
		 }
	 }
}
