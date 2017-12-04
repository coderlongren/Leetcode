
public class leetcode235_lowest_common_ancestor_od_a_binary_search_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		 if (root == p || root == q){
			 return root;
		 }
		 // 在左子树
		 else if (root.val > Math.max(q.val, p.val)){
			 return lowestCommonAncestor(root.left, p, q);
		 }
		 // 在右子树
		 else if (root.val < Math.min(q.val, p.val)){
			 return lowestCommonAncestor(root.right, p, q);
		 }
		 else {
			 return root;
			 
		 }
		 
		 
		 
	 }

}
