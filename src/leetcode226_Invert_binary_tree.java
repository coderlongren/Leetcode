
public class leetcode226_Invert_binary_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// ����ʹ�� DFS ���� BFS ������ʹ��DFS 
	public static TreeNode invertTree(TreeNode root) {
        if (root == null){
        	return null;
        }
        
		TreeNode tempNode = root.left;
		root.left = invertTree(root.right);
		root.right = invertTree(tempNode);
		return root;
    }
	

}
