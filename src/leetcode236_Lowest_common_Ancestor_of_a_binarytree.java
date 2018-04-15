/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��12�� ����10:45:19
* ��˵��:  ʹ��һ���򵥵� �ݹ�Ϳ��Խ����,
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
		
		// ���൱��ʹ��
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
