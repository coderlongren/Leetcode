package test;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��16�� ����2:35:17
* ��˵��: 
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
