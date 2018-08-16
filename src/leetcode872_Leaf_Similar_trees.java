import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年7月22日 下午9:21:50
* 类说明: 
*/
public class leetcode872_Leaf_Similar_trees {
	public static List<Integer> list1 = new ArrayList<>();
	public static List<Integer> list2 = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
		bottom_sequence(root1, list1);
		bottom_sequence(root2, list2);
		if (list1.size() == list2.size()) {
			for (int i = 0; i < list1.size(); i++) {
				if (list1.get(i) != list2.get(i)) {
					return false;
				}
			}
			return true;
		}
		return false;
		
    }
	public static void bottom_sequence(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			list.add(root.val);
		}
		bottom_sequence(root.left, list);
		bottom_sequence(root.right, list);
	}
}
