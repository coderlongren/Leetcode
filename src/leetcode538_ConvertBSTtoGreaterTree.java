/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��5�� ����9:10:27
* ��˵��: 
*/
public class leetcode538_ConvertBSTtoGreaterTree {
	static Integer pre = -1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leetcode538_ConvertBSTtoGreaterTree leetcode538_ConvertBSTtoGreaterTree = new leetcode538_ConvertBSTtoGreaterTree();
		TreeNode root = new TreeNode(5);
		root.right =  new TreeNode(13);
		root.left = new TreeNode(2);
		leetcode538_ConvertBSTtoGreaterTree.convertBST(root);
//		leetcode538_ConvertBSTtoGreaterTree.search(root);
		
	}
	public  TreeNode convertBST(TreeNode root) {
//		Integer pre = -1;
		A a = new A();
		a.val = Integer.MIN_VALUE;
        search(root,a);
        return root;
    }
	public int search(TreeNode root,A a){
		if (root == null){
			return 0;
		}
		search(root.right, a);
		if (a.val != Integer.MIN_VALUE){
			root.val = root.val + a.val;
		}
		a.val = root.val;
		search(root.left, a);
		return a.val;
	}
	class A{
		int val;
	}
}
