/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月6日 上午11:35:19
* 类说明:  根结点1的左右两个子树的深度之和再加1
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
