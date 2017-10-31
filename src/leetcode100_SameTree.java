
public class leetcode100_SameTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	}
	 public static boolean isSameTree(TreeNode p, TreeNode q) {
		 if (p == null && q == null){
			 return true;
		 }
		 if (p == null || q == null){
			 return false;
		 }
		 if (p.val == q.val){
			 return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		 }
		 return false;
	 }

}
