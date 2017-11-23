
public class leetcode111_Mininum_Depth_of_Binary_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int minDepth(TreeNode root) {
        if (root == null){
        	return 0;
        }
        int depth_left = minDepth(root.left);
        int depth_right = minDepth(root.right);
        
		return 1 + (Math.min(depth_left, depth_right) > 0? Math.min(depth_left, depth_right): Math.max(depth_left, depth_right));
		
    }
	

}
