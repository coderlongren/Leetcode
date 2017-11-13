import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.print.attribute.standard.NumberOfDocuments;

public class leetcode103_Binary_Tree_ZigZag_Level_Order_Traversal {

	// 这一题 基本上和上一题的 深度优先遍历差不多吧
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	    List<List<Integer>> res = new ArrayList<List<Integer>>();
	    if (root == null){
	    	return res;
	    }
	    // 我们可以维护两个stack 一个stack 是从左往右进栈 另一个是 从右往左进栈
	    Stack<TreeNode> stack1 = new Stack<TreeNode>();
	    Stack<TreeNode> stack2 = new Stack<TreeNode>();
	    stack1.push(root);
	    
	    while(!stack1.isEmpty() || !stack2.isEmpty()){
	    	List<Integer> temp = new ArrayList<Integer>();
	    	while(!stack1.isEmpty()){
	    		TreeNode node = stack1.pop();
	    		temp.add(node.val);
	    		if (node.left != null){
	    			stack2.add(node.left);
	    		}
	    		if (node.right != null){
	    			stack2.add(node.right);
	    		}
	    	}
	    	if (temp.size() != 0){
	    		res.add(temp);	
	    	}
	    	
	    	//重新给temp赋值
	    	temp = new ArrayList<Integer>();
	    	while(!stack2.isEmpty()){
	    		TreeNode node = stack2.pop();
	    		
	    		temp.add(node.val);
	    		if (node.right != null){
	    			stack1.add(node.right);
	    		}
	    		if (node.left != null){
	    			stack1.add(node.left);
	    		}
	    		
	    	}
	    	if (temp.size() != 0){
	    		res.add(temp);	
	    	}
	    	
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
