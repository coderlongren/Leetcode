/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��16�� ����10:42:45
* ��˵��:  ��ζ�һ�ƶ���������  ���м�֦�����أ�
*/
public class leetcode669_trim_a_binary_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public TreeNode trimBST(TreeNode root, int L, int R) {
	        if (root == null){
	        	return null;
	        }
	        if (root.val < L){
	        	return trimBST(root.right, L, R);
	        }
	        if (root.val > R){
	        	return trimBST(root.left, L, R);
	        }
	        root.left = trimBST(root.left, L, R);
	        root.right = trimBST(root.right, L, R);
	        return root;
	    }

}
