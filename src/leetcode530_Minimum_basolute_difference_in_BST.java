import java.util.LinkedList;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��4�� ����10:35:00
* ��˵��: ����Ľ�� ��ȷ�ļ� ��һ��Ŀ
*/
public class leetcode530_Minimum_basolute_difference_in_BST {
	 static Integer min = Integer.MAX_VALUE;
	 static int pre = -1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Integer.MAX_VALUE);
		leetcode530_Minimum_basolute_difference_in_BST basolute_difference_in_BST  = new leetcode530_Minimum_basolute_difference_in_BST();
//		System.out.println(min);
////		basolute_difference_in_BST.test(min);
////		System.out.println(min);
//		System.out.println(basolute_difference_in_BST.test(min));
//		basolute_difference_in_BST.test1(min);
//		System.out.println(min);
		TreeNode root = new TreeNode(1);
		root.right =  new TreeNode(3);
		root.right.left = new TreeNode(2);
		System.out.println(basolute_difference_in_BST.getMinimumDifference(root));
	}
	 public int getMinimumDifference(TreeNode root) {
		 search(root, pre, min);
		 return min;
	 }
	 // ����������� ����򵥵�
	 public  int search(TreeNode root,int pre,int min){
		 if (root == null){
			 return min;
		 }
		 search(root.left, pre, min);
		 if (pre != -1){
			 min = Math.min(min, root.val - pre);
		 }
		 pre = root.val;

		 search(root.right, pre, min);
		 return min;
	 }
	 public  int test (int min){
		 min = 20;
		 return min;
	 }
	 public  void test1 (int min){
		 min = 30;
	 }

}
