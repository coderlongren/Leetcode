import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;


/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��6�� ����11:39:08
* ��˵��:  ����� static�����Ļ�����ͨ����ԭ����ʲô��Ҳ��Ҫ֪������˵�ǿ���AC��
*/
public class leetcode538_convert_a_tree_to_greater {
	int pre = Integer.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leetcode538_convert_a_tree_to_greater leetcode538_convert_a_tree_to_greater = new leetcode538_convert_a_tree_to_greater();
		TreeNode root = new TreeNode(2);
		root.right =  new TreeNode(3);
		root.left = new TreeNode(1);
		leetcode538_convert_a_tree_to_greater.convertBST(root);
	}
	public  TreeNode convertBST(TreeNode root) {
		search(root);
        return root;
    }
	public int search(TreeNode root){
		if (root == null){
			return 0;
		}
		search(root.right);
		if (pre != Integer.MIN_VALUE){
			root.val = root.val + pre;
		}
		pre = root.val;
		search(root.left);
		return pre;
	}

}
