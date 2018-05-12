/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月30日 下午9:08:59
* 类说明: 
*/
public class leetcode513_find_Bottom_Left_tree_value {
	public static int H = 0;
	public static int left;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(6);
		root.left.right = new TreeNode(110);
		System.out.println(findBottomLeftValue(root));
	}
	public static int findBottomLeftValue(TreeNode root) {
		dfs(root, 1);
		return left;
	}
	public static void dfs (TreeNode root, int height) {
		if (root == null) {
			return;
		}
		if (height > H) {
			if (root.left == null && root.right == null) {
				left = root.val;
			}
		}
		H = Math.max(H, height);
		dfs(root.left, height + 1);
		dfs(root.right, height + 1);
	}

}
