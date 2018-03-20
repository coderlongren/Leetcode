package 树的几种遍历;

import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月21日 上午10:56:26
* 类说明: 
*/
public class Pre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3); 
		root.right = new TreeNode(6);
		preOrder2(root);
		
	}
	public static void preOrder1(TreeNode root)     //递归前序遍历 
	{	
		if (root == null) {
			return;
		}
		System.out.println(root.val);
	    preOrder1(root.left);
	    preOrder1(root.right);
	}
	public static void preOrder2(TreeNode root) {     // 栈 非递归前序遍历 
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		while (temp != null || !stack.isEmpty()) {
			// 左子树 全都进栈 
			while (temp != null) {
				System.out.println(temp.val);
				stack.push(temp);
				temp = temp.left;
			}
			if (!stack.isEmpty()) {
				temp = stack.pop();
				temp = temp.right;
			}
		}
		
	}
	
}
