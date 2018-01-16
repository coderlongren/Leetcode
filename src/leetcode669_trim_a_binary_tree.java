/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月16日 下午10:42:45
* 类说明:  如何对一科二叉搜索树  进行剪枝操作呢？
*/
public class leetcode669_trim_a_binary_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public TreeNode trimBST(TreeNode root, int L, int R) {
	        if (root == null){
	        	return null;
	        }
	        if (root.val < L){
	        	return trimBST(root.right, L, R);
	        }
	        if (root.val > R){
	        	return trimBST(root.left, L, R);
	        }
	        root.left = trimBST(root.left, L, R);
	        root.right = trimBST(root.right, L, R);
	        return root;
	    }

}
