package 剑指offer;

import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月16日 下午7:19:41
* 类说明: 
*/
public class Kth_Node_of_tree {
	int count = 0;
	TreeNode KthNode(TreeNode pRoot, int k) {
		if (pRoot != null) {
			TreeNode next = KthNode(pRoot.left, k);
			if (next != null) {
				return next;
			}
			count++;
			if (count == k) {
				return pRoot;
			}
			
			TreeNode next2 = KthNode(pRoot.right, k);
			if (next2 != null) {
				return next2;
			}
		}
		return null;
	}
	TreeNode KthNode2(TreeNode pRoot, int k) {
		if (pRoot == null || k == 0) {
			return null;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode root = pRoot;
		int count = 0;
		while (!stack.isEmpty() || root != null) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			if (!stack.isEmpty()) {
				
				root = stack.pop();
				count++;
				if (count == k) {
					return root;
				}
				root = root.right;
			}
		}
		return null;
	}
}
