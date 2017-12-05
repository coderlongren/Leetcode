import java.util.LinkedList;
import java.util.Queue;

public class leetcode404_Sum_Of_Left_Leaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 唉 每次都是在关键的时候 没有思路了 
	// 这道题目 是很简单的 使用BFS 
	// 关键在 如何判断一个节点 是不是左孩子节点
	
	 public static int sumOfLeftLeaves(TreeNode root) {
	     if (root == null){
	    	 return 0;
	     }   
	     int sum = 0;
	     Queue<TreeNode> queue = new LinkedList<TreeNode>();
	     queue.offer(root);
	     
	     while (!queue.isEmpty()){
	    	 // 出队列一个 
	    	 TreeNode tempNode = queue.poll();
	    	 //  在根节点左边 且他的左右孩子都为null 即左叶子节点
	    	 if (tempNode.left != null && tempNode.left.left == null && tempNode.left.right == null){
	    		 sum += tempNode.left.val;
	    	 }
	    	 if (tempNode.left != null){
	    		 queue.offer(tempNode.left);
	    	 }
	    	 if (tempNode.right != null){
	    		 queue.offer(tempNode.right);
	    	 }
	     }
	     return sum;
	 }
}
