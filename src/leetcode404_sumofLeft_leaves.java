
public class leetcode404_sumofLeft_leaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// ʹ��DFS 
	 public static int sumOfLeftLeaves(TreeNode root) {
		 if (root == null){
			 return 0;
		 }
		 return sum_leaves(root, false);
	 }
	 public static int sum_leaves(TreeNode root,boolean flag){
		 if (root == null){
			 return 0;
		 }
		 // ����Ҷ�ӽڵ��� 
		 if (root.left == null && root.right == null ){
			 return flag? root.val: 0;
		 }
		 return sum_leaves(root.left, true) + sum_leaves(root.right, false);
		 
	 }

}
