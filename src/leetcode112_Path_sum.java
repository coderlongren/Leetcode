import java.nio.file.Path;

import javax.xml.bind.ValidationEvent;

public class leetcode112_Path_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static boolean hasPathSum(TreeNode root, int sum) {
		 if (root == null){
			 return false;
		 }
		 if (root.left == null && root.right == null && root.val == sum){
			 return true;
		 }
		 return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
	 } 
//	 }
//	 public static boolean hasPath(TreeNode root,int count,int sum){
//		 // 到达了叶子节点
//		 if (root.left == null && root.right == null){
//			 
//		 }
//	 }

}
