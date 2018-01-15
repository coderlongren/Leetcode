import org.omg.CORBA.TRANSACTION_REQUIRED;

import test.test;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月15日 下午10:31:12
* 类说明: 
*/
public class leetcode617_Merge_two_Binary_trees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(3); t1.right = new TreeNode(2);
		t1.left.left = new TreeNode(5);
		TreeNode t2 = new TreeNode(2);
		t2.left = new TreeNode(1); t2.right = new TreeNode(3);
		t2.left.right = new TreeNode(4); t2.right.right = new TreeNode(7);
		leetcode617_Merge_two_Binary_trees leetcode617_Merge_two_Binary_trees = new leetcode617_Merge_two_Binary_trees();
		
		leetcode617_Merge_two_Binary_trees.mergeTrees(t1, t2);
		
	}
	public  TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode newTree = new TreeNode(0);
//        merge(t1, t2, newTree);
        test(newTree);
        System.out.println(newTree.val);
        return newTree;
    }
	public  void merge(TreeNode t1, TreeNode t2,TreeNode temp){
		if (t1 != null && t2 != null){
			temp = new TreeNode(t1.val + t2.val);
			merge(t1.left, t2.left, temp.left);
			merge(t1.right, t2.right, temp.right);
		}
		else if (t1 != null){
			temp = t1;
		}
		else if (t2 != null){
			temp = t2;
		}
		else {
			
		}
		
	}
	public  void test(TreeNode temp){
		temp = new TreeNode(2);
		temp.left = new TreeNode(0);
	}

}
