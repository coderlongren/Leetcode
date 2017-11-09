import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.management.Query;

public class leetcode107_BinaryTreeLevelOrderTraversal {
	//����ʹ�� ������������㷨 ���� ������������㷨
	// ���� ��������
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
				 // poll() ���ص�һ��Ԫ�� ������ɾ�� �� peek() element()��ֻ���ص�һ��Ԫ��������ͬ
				 subList.add(queue.poll().val);
			 }
			 // ����һ��ֵ�ü�ס�� �������� List.add(int index,elemeng,ele); ��Ԫ�ز��뵽����λ��
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
