package leetcodeContest79;

import leetcodeContest71.TreeNode;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月8日 下午1:11:30
* 类说明: 
*/
public class leetcode814_Binary_Tree_Pruning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 简单的递归就可以了，主要是找到如何判断一个subTree返回null的时机
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
