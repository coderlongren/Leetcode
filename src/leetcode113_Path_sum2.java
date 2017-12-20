import java.util.LinkedList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月19日 下午10:52:52
* 类说明: 
*/
public class leetcode113_Path_sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right =  new TreeNode(4);
		root.right.left = new TreeNode(3);
		root.right.right = new TreeNode(6);
		System.out.println(pathSum(root, 5));
	}
	public static List<List<Integer>> pathSum(TreeNode root, int sum){
		List<List<Integer>> result  = new LinkedList<List<Integer>>();
		List<Integer> currentResult  = new LinkedList<Integer>();
		pathSum(root,sum,currentResult,result);
		return result;
	}
	 public static void pathSum(TreeNode root, int sum, List<Integer> currentResult,
				List<List<Integer>> result) {

			if (root == null)
				return;
			currentResult.add(new Integer(root.val));
			if (root.left == null && root.right == null && sum == root.val) {
				result.add(new LinkedList(currentResult));
				currentResult.remove(currentResult.size() - 1);//don't forget to remove the last integer
				return;
			} else {
				pathSum(root.left, sum - root.val, currentResult, result);
				pathSum(root.right, sum - root.val, currentResult, result);
			}
			currentResult.remove(currentResult.size() - 1);
		}
}
