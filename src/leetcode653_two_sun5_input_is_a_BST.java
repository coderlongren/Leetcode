import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class leetcode653_two_sun5_input_is_a_BST {
	public  static boolean findTarget(TreeNode root, int k) {
		
		Set<Integer> set =  new HashSet<Integer>();
		return dfs(root,set,k);
    }
	public static boolean dfs(TreeNode root,Set<Integer> set,int k){
		if (root == null){
			return false;
		}
		if (set.contains(k - root.val)){
			return true;
		}
		set.add(root.val);
		return dfs(root.left, set, k) || dfs(root.right, set, k);
	
	}

}
