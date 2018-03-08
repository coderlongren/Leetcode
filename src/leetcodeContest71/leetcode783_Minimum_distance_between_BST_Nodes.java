package leetcodeContest71;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月21日 上午10:52:51
* 类说明: 
*/
public class leetcode783_Minimum_distance_between_BST_Nodes {
	int min = Integer.MAX_VALUE;
	Integer pre = null;
	public int minDiffInBST(TreeNode root) {
		search(root);
		return min;
	}
	public int search(TreeNode root) {
		if (root == null) {
			return min;
		}
		search(root.left);
		if (pre != null) {
			min = Math.min(min, root.val - pre);
		}
		pre = root.val;
		search(root.right);
		return min;
	}
	public static void main(String[] args) {
		leetcode783_Minimum_distance_between_BST_Nodes test = new leetcode783_Minimum_distance_between_BST_Nodes();
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right = new TreeNode(6);
		int min = test.minDiffInBST(root);
		System.out.println(min);
		
	}
}
