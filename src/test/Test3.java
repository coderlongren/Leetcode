package test;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月16日 下午2:35:17
* 类说明: 
*/
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head = new TreeNode(0);
		gouzao(head);
		System.out.println(head.left.val);
	}
	public static void gouzao(TreeNode tree){
		tree.left = new TreeNode(2);
	}
}
