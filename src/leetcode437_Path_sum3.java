import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月20日 下午5:06:52
* 类说明: 和前两道Pathsum，不同的是，前两道都是求到达叶子节点的路径，这次
*  没有要求必须到达叶子节点，当然只求出这样的路径次数，降低了难度
*/
public class leetcode437_Path_sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "abc";
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(3);
		root.right.right.right = new TreeNode(4);
		System.out.println(path(root, 3));
		
	}
	public static int pathSum(TreeNode root, int sum) {
		if (root == null){
			return 0;
		}
		return path(root, sum) + path(root.left, sum) + path(root.right, sum) + path(root, sum);
    }
	public static int path(TreeNode root,int sum){
		if (root == null){
			return 0;
		}
		if(root.val == sum){
			return 1 + path(root.left, sum - root.val) + path(root.right, sum - root.val);
		}
		else{
			return path(root.left, sum - root.val) + path(root.right, sum - root.val);
		}
		
//		return path(root.left, sum - root.val) + path(root.right, sum - root.val);
//		返回次数
	}

}
