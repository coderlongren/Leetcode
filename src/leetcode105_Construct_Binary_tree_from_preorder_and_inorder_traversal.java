import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��17�� ����9:57:01
* ��˵��: bug�� ���ĸо����������� ������
*/
public class leetcode105_Construct_Binary_tree_from_preorder_and_inorder_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	 public static TreeNode buildTree(int[] preorder, int[] inorder) {
		 TreeNode root = reConstruct(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
		 return root;
	 }
	 // ʹ��ǰ��������� ����������ؽ�������
	 public static TreeNode reConstruct(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
		 // ��� ��ʼ������ڽ������꣬ ��Ч������
		 if (startIn > endIn || startPre > endPre) {
			 return null;
		 }
		 //  ǰ�������һ���ڵ㣬�� ���ڵ�
		 TreeNode root = new TreeNode(pre[0]);
		 for (int i = startIn; i <= endIn; i++) {
			 // ������������ҵ����ڵ�
			 if (in[i] == pre[startPre]) {
				 root.left = reConstruct(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
				 root.right = reConstruct(pre, startPre + i - startIn + 1, endPre, in, i + 1, endIn);
			 }
		 }
		 return root;
	 }
	 // �Լ������粩���Ͽ��������� ��д����һ����ʽ���㷨�� �������
	 // ���� ������ѧ֪ʶ�ĺ����һЩ
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
		 TreeNode root = null; // Ҫ���ص� ͷ���
		 List<Integer> leftpreOrder = new ArrayList<>();
		 List<Integer> rightpreOrder = new ArrayList<>();
		 List<Integer> leftinOrder = new ArrayList<>();
		 List<Integer> rightinOrder = new ArrayList<>();
		 int preOrderPos;
		 int inOrderPos;
		 
		 if (pre.size() != 0 && in.size() != 0) {
			 // ��pre�ĵ�һ��Ԫ�أ�����root
			 root = new TreeNode(pre.get(0));
			 // ֪���� root�Ľڵ�λ�ã�����root���� ����������
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
