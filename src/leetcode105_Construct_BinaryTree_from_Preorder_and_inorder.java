
public class leetcode105_Construct_BinaryTree_from_Preorder_and_inorder {

	/**
	 * Given preorder and inorder traversal of a tree ,
	 * construct the binary tree
	 * Node:
	 * you may assume that duplicates do not exit in the tree
	 * ����ǰ����� �� ������� ���������
	 */
	
	public static void main(String[] args) {
		
		
	}
	// ���������
	public static TreeNode builtTree(int[] preorder,int[] inorder){
		
		return new TreeNode(0);
	}
	//���캯��
	public static TreeNode built(int prestart,int instart,int end,int[] preorder,int[] inorder){
		
		
		return null;
		
		
		
	}
	//����Ķ������ڵ�
	public static class TreeNode{
		public  int val;
		public TreeNode left;
		public TreeNode right;
		
		public TreeNode(int val){
			this.val = val;
		}
	} 

}
