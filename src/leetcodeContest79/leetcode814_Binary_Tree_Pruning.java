package leetcodeContest79;

import leetcodeContest71.TreeNode;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��8�� ����1:11:30
* ��˵��: 
*/
public class leetcode814_Binary_Tree_Pruning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// �򵥵ĵݹ�Ϳ����ˣ���Ҫ���ҵ�����ж�һ��subTree����null��ʱ��
	public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
        	return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.left == null && root.right == null && root.val == 0) {
        	return null;
        }
        return root;
    }

}
