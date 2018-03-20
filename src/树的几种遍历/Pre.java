package ���ļ��ֱ���;

import java.util.Stack;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��21�� ����10:56:26
* ��˵��: 
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
	public static void preOrder1(TreeNode root)     //�ݹ�ǰ����� 
	{	
		if (root == null) {
			return;
		}
		System.out.println(root.val);
	    preOrder1(root.left);
	    preOrder1(root.right);
	}
	public static void preOrder2(TreeNode root) {     // ջ �ǵݹ�ǰ����� 
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		while (temp != null || !stack.isEmpty()) {
			// ������ ȫ����ջ 
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
