/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��17�� ����10:05:40
* ��˵��: 
*/
public class leetcode114_Flatten_binary_to_lisked_list {
	private TreeNode prev = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public void flatten(TreeNode root) {
    	if (root == null) {
    		return;
    	}
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }

}
