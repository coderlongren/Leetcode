/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月5日 上午10:59:51
* 类说明: 
*/
public class leetcode630_MinimumAbsoluteDifferenceinBST {
	int min = Integer.MAX_VALUE;
	int pre = -1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.right =  new TreeNode(3);
		root.right.left = new TreeNode(2);
		leetcode630_MinimumAbsoluteDifferenceinBST basolute_difference_in_BST  = new leetcode630_MinimumAbsoluteDifferenceinBST();
		System.out.println(basolute_difference_in_BST.getMinimumDifference(root));
	}
	public int getMinimumDifference(TreeNode root) {
		if (root == null){
			return min;
		}
		getMinimumDifference(root.left);
		if (pre != -1){
			 min = Math.min(min, root.val - pre);
		}
		pre = root.val;
		getMinimumDifference(root.right);
		return min;
	
		
	}

}
