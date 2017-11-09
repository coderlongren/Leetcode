import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.management.Query;

public class leetcode107_BinaryTreeLevelOrderTraversal {
	//可以使用 深度优先搜索算法 或者 广度优先搜索算法
	// 本题 采用深搜
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		 
		 Queue<TreeNode> queue = new LinkedList<TreeNode>();
		 queue.offer(root);
		 List<List<Integer>> result = new LinkedList<List<Integer>>();
		 if (root == null){
			 return result;
		 }
		 while (!queue.isEmpty()){
			 int level = queue.size();
			 List<Integer> subList = new LinkedList<Integer>();
			 for (int i = 0; i < level; i++){
				 
				 if (queue.peek().left != null){
					 queue.offer(queue.peek().left);
				 }
				 if (queue.peek().right != null){
					 queue.offer(queue.peek().right);
				 }
				 // poll() 返回第一个元素 并将其删除 与 peek() element()：只返回第一个元素有所不同
				 subList.add(queue.poll().val);
			 }
			 // 这是一个值得记住的 方法参数 List.add(int index,elemeng,ele); 把元素插入到特殊位置
			 result.add(0,subList);
			 
		 }
		 
		 
		 return result;
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
