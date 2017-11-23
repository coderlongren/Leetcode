import java.nio.file.Path;

public class leetcode112_Path_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static boolean hasPathSum(TreeNode root, int sum) {
		return false;
	        
		 
	 }
	 public static int Path(TreeNode root,int val,int sum){
		 if (root == null){
			 return 0;
		 }
		 if (val + root.val > sum){
//			 return ;
		 }
		return sum;
		 
	 }

}
