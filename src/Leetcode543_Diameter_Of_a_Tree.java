/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��6�� ����11:35:19
* ��˵��:  �����1�������������������֮���ټ�1
*/
public class Leetcode543_Diameter_Of_a_Tree {
	int max = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leetcode543_Diameter_Of_a_Tree leecode543_Diameter_Of_a_Tree = new Leetcode543_Diameter_Of_a_Tree();
//		System.out.println(a);
//		leecode543_Diameter_Of_a_Tree.test();
//		System.out.println(a);
	}
	 public int diameterOfBinaryTree(TreeNode root) {
		maxDeth(root);
	    return max;    
	 }
	 public int maxDeth(TreeNode root){
		 if (root == null){
			 return 0;
		 }
		 
		 int leftDeth = maxDeth(root.left);
		 int rightDeth = maxDeth(root.right);
		 max = Math.max(max, rightDeth + leftDeth);
		 return Math.max(leftDeth, rightDeth) + 1;
	 }

}
