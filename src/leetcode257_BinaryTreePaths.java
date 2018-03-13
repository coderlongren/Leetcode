import java.util.LinkedList;
import java.util.List;

public class leetcode257_BinaryTreePaths {
	public static void main(String[] args) {
		
	}
	
	 public List<String> binaryTreePaths(TreeNode root) {
		 List<String> paths = new LinkedList<String>();
		 if (root == null){
			 return paths;
		 }
		 searchBT(root, "", paths);
		return paths;
	  }
	  // 简单的回溯法实现
	 public static void searchBT(TreeNode root,String path,List<String> answer){
		 
		 if (root.left == null && root.right == null){
			 answer.add(path + root.val);
		 }
		 if (root.left != null){
			 searchBT(root.left, path + root.val + "->", answer);
		 }
		 if (root.right != null){
			 searchBT(root.right, path + root.val + "->", answer);

		 }
		 
		 
	 }
	 public static class TreeNode{
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x){
			 this.val = x;
		 }
	 }
}
