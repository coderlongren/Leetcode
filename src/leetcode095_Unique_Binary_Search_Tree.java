import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月31日 上午9:48:07
* 类说明: 
*/
public class leetcode095_Unique_Binary_Search_Tree {
	public static void main(String[] args) {
		for (TreeNode list : generateTrees(3)) {
			printTree(list);
			System.out.println("*************************************");
		}
	}
	public static List<TreeNode> generateTrees(int n) {
		if (n == 0) {
			return new ArrayList<>();
		}
        return genTrees(1, n);
    }
	public static List<TreeNode> genTrees (int start, int end) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        if(start > end) {
            list.add(null);
            return list;
        }
        if(start == end) {
            list.add(new TreeNode(start));
            return list;
        }
        List<TreeNode> left,right;
        // 以i为根节点
        for(int i=start;i<=end;i++) {
            
            left = genTrees(start, i-1);
            right = genTrees(i+1,end);
            
            for(TreeNode lnode: left) {
                for(TreeNode rnode: right) {
                    TreeNode root = new TreeNode(i);
                    root.left = lnode;
                    root.right = rnode;
                    list.add(root);
                }
            }
        }
        return list;
    }
	 public static void printTree(TreeNode head) {
		 if (head != null) {
			 System.out.println(head.val);
		 }
		 if (head.left != null) {
			 printTree(head.left);
		 }

		 if (head.right != null) {
			 printTree(head.right);
		 }
	 }
}
