
public class leetcode572_Subtree_of_another_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean isSubtree(TreeNode s, TreeNode t) {
//        while (s != null){
//        	if (s.val == t.val){
//        		if (same(s,t)){
//        			flag = true;
//        			break;
//        		}
//        	}
//        	
// 
//        }
		if (s == null){
			return false;
		}
		if (same(s, t)){
			return true;
		}
		
        return isSubtree(s.left, t) || isSubtree(s.right, t);
	} 
	private static boolean same(TreeNode s, TreeNode t) {
		//  如何判断两棵树是不是 相同的呢？  仔细考虑啊  傻龙 ，又是递归
		if (s == null && t == null){
			return true;
		}
		if (s == null || t== null){
			return false;
		}
		if (s.val != t.val){
			return false;
		}
		return same(s.left, t.left) && same(s.right, t.right);
	}

}
