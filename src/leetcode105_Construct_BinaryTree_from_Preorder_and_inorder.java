
public class leetcode105_Construct_BinaryTree_from_Preorder_and_inorder {

	/**
	 * Given preorder and inorder traversal of a tree ,
	 * construct the binary tree
	 * Node:
	 * you may assume that duplicates do not exit in the tree
	 * 根据前序遍历 和 中序遍历 构造二叉树
	 */
	
	public static void main(String[] args) {
		
		
	}
	// 主函数入口
	public static TreeNode builtTree(int[] preorder,int[] inorder){
		
		return new TreeNode(0);
	}
	//构造函数
	public static TreeNode built(int prestart,int instart,int end,int[] preorder,int[] inorder){
		
		
		return null;
		
		
		
	}
	//定义的二叉树节点
	public static class TreeNode{
		public  int val;
		public TreeNode left;
		public TreeNode right;
		
		public TreeNode(int val){
			this.val = val;
		}
	} 

}
