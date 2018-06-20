package ���ļ��ֱ���;

import java.util.Stack;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��21�� ����11:16:44
* ��˵��: 
*/
public class In {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right = new TreeNode(6);
		in2(root);
		
	}
	public static void in1(TreeNode root)     //�ݹ�������� 
	{	
		if (root == null) {
			return;
		}
	    in1(root.left);
	    System.out.println(root.val);
	    in1(root.right);
	}
	public static void in2(TreeNode root) {     // ջ   �ǵݹ�������� 
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		while (temp != null || !stack.isEmpty()) {
			// ������ ȫ����ջ 
			while (temp != null) {
				stack.push(temp);
				temp = temp.left;
			}
			if (!stack.isEmpty()) {
				temp = stack.pop();
				System.out.println(temp.val);
				temp = temp.right;
			}
		}
		
	}
	public static TreeNode inNextNode(TreeNode root, TreeNode p) {
		if (p.right != null) {
			return inNextNode(root, p.right);
		}
		else {
			TreeNode suc = null;
			while (root != null) {
				if (root.val < p.val) {
					root = root.right;
					suc = root;
				}
				else if (root.val > p.val) {
					root = root.left;
					suc = root;
				}
				else {
					break;
				}
			}
			return suc;
			
		}
	}
	
}
