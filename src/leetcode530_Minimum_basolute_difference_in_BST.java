import java.util.LinkedList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月4日 下午10:35:00
* 类说明: 
*/
public class leetcode530_Minimum_basolute_difference_in_BST {
	Integer min = Integer.MAX_VALUE;
	int pre = -1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE);
	}
	 public int getMinimumDifference(TreeNode root) {
		 search(root, pre, min);
		 return min;
	 }
	 // 采用中序遍历 是最简单的
	 public  void search(TreeNode root,int pre,int min){
		 if (root == null){
			 return ;
		 }
		 search(root.left, pre, min);
		 if (pre != -1){
			 min = Math.min(min, root.val - pre);
		 }
		 pre = root.val;

		 search(root.right, pre, min);
		 
	 }

}
