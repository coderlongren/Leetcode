import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月17日 上午9:57:01
* 类说明: bug， 真心感觉构建二叉树 扯淡啊
*/
public class leetcode105_Construct_Binary_tree_from_preorder_and_inorder_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	 public static TreeNode buildTree(int[] preorder, int[] inorder) {
		 TreeNode root = reConstruct(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
		 return root;
	 }
	 // 使用前序遍历，和 中序遍历来重建二叉树
	 public static TreeNode reConstruct(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
		 // 如果 起始坐标大于结束坐标， 无效的输入
		 if (startIn > endIn || startPre > endPre) {
			 return null;
		 }
		 //  前序遍历第一个节点，即 根节点
		 TreeNode root = new TreeNode(pre[0]);
		 for (int i = startIn; i <= endIn; i++) {
			 // 在中序遍历中找到根节点
			 if (in[i] == pre[startPre]) {
				 root.left = reConstruct(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
				 root.right = reConstruct(pre, startPre + i - startIn + 1, endPre, in, i + 1, endIn);
			 }
		 }
		 return root;
	 }
	 // 自己在网络博客上看到别人用 递写得另一种形式的算法， 比上面的
	 // 这种 各种数学知识的好理解一些
	 public static TreeNode buildTree2(int[] preorder, int[] inorder) {
		 List<Integer> preOrder = new ArrayList<>();
		 List<Integer> inOrder = new ArrayList<>();
		 for (int i : preorder) {
			 preOrder.add(i);
		 }
		 for (int i : inorder) {
			 inOrder.add(i);
		 }
		 return constructBinaryTree(preOrder, inOrder);
	 }
	 public static TreeNode constructBinaryTree(List<Integer> pre, List<Integer> in) {
		 if (pre == null || in == null) {
			 return null;
		 }
		 TreeNode root = null; // 要返回的 头结点
		 List<Integer> leftpreOrder = new ArrayList<>();
		 List<Integer> rightpreOrder = new ArrayList<>();
		 List<Integer> leftinOrder = new ArrayList<>();
		 List<Integer> rightinOrder = new ArrayList<>();
		 int preOrderPos;
		 int inOrderPos;
		 
		 if (pre.size() != 0 && in.size() != 0) {
			 // 把pre的第一个元素，当做root
			 root = new TreeNode(pre.get(0));
			 // 知道了 root的节点位置，根据root坐标 划分两部分
			 inOrderPos = in.indexOf(pre.get(0));
			 leftinOrder = in.subList(0, inOrderPos);
			 rightinOrder = in.subList(inOrderPos + 1, in.size());
			 preOrderPos = leftinOrder.size();
			 leftpreOrder = pre.subList(1, preOrderPos + 1);
			 rightpreOrder = pre.subList(preOrderPos + 1, pre.size());
			 
			 root.left = constructBinaryTree(leftpreOrder, leftinOrder);
			 root.right = constructBinaryTree(rightpreOrder, rightinOrder);
		 }
		 return root;
	 }

}
