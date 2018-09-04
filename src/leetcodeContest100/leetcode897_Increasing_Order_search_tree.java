package leetcodeContest100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import ��ָoffer.TreeNode;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��9��2�� ����9:38:00
* ��˵��: 
*/
public class leetcode897_Increasing_Order_search_tree {
	public static void main(String[] args) {
		
	}
	 public TreeNode increasingBST(TreeNode root) {
		 List<TreeNode> list = new ArrayList<>();
		 preOrder1(root, list);
		 int len = list.size();
		 TreeNode root2 = root;
		 for (int i = 0; i < list.size() - 1; i++) {
			 list.get(i).left = null;
			 list.get(i).right = list.get(i + 1);
		 }
		 list.get(list.size() - 1).left = null;
		 list.get(list.size() - 1).right = null;
		 return list.get(0);
	 }
	 public static void preOrder1(TreeNode root, List<TreeNode> list) {	
		if (root == null) {
			return;
		}
	    preOrder1(root.left,  list);
	    list.add(root);
	    preOrder1(root.right,  list);
	 }
}
