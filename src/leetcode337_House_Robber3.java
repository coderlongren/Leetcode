/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月24日 上午10:27:12
* 类说明: 
*/
public class leetcode337_House_Robber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 这次我们不能抢  相邻的层节点
	public int rob(TreeNode root) {
	      if (root == null) {
	    	  return 0;
	      }
	      return Math.max(robInclude(root), robExclude(root));
	 }
	// 这个节点 抢劫了， 就意味着左右孩子节点都不抢劫
	public int robInclude(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return robExclude(root.left) + robExclude(root.right) + root.val; 
	}
	// 如果这个节点 不抢劫的话， 此问题就转化为 抢劫两个孩子节点的和的问题了
	public int robExclude (TreeNode root) {
		if (root == null) {
			return 0;
		}
		return rob(root.left) + rob(root.right);
	}
	
	
}