import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode102_Binary_Tree_Level_Order_Traversal {

	// 就是求二叉树的深度优先遍历
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public static List<List<Integer>> levelOrder(TreeNode root) {
	      List<List<Integer>> res = new ArrayList<List<Integer>>();
	      
		  if (root == null){
			  return res;
		  }
		  Queue<TreeNode> queue = new LinkedList<TreeNode>();
		  //加入第一个 元素
		  queue.offer(root);
	      while (!queue.isEmpty()){
	    	  List<Integer> subList = new ArrayList<Integer>();
	    	  int size = queue.size();
	    	  for (int i = 0; i < size; i++){
	    		  if (queue.peek().left != null){
	    			  queue.offer(queue.peek().left);
	    		  }
	    		  if (queue.peek().right != null){
	    			  queue.offer(queue.peek().right);
	    		  }
	    		  subList.add(queue.poll().val);
	    	  }
	    	  res.add(subList);
	      }
	      return res;
	  }
	  public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
		}
}
