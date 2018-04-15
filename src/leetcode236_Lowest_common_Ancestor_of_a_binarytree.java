/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月12日 下午10:45:19
* 类说明:  使用一个简单的 递归就可以解决了,
*/
public class leetcode236_Lowest_common_Ancestor_of_a_binarytree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);
		root.right = new TreeNode(1);
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(8);
		
		System.out.println(lowestCommonAncestor(root, root.left, root.left.left).val);
		System.out.println("end the program! ");
	}
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		// 就相当于使用
        if (root == null || root == p || root == q) {
        	return root;
        }
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        if (left != null && right != null) {
        	return root;
        } 
        
        return left == null ? right:left;
        
    }

}
