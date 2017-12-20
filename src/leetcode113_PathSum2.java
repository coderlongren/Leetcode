import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月20日 下午2:20:04
* 类说明:  比起第一种解法，这种使用Stack<Integer>的方法 更为直观 ，DFS 
*/
public class leetcode113_PathSum2 {
	private List<List<Integer>> result = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		if (root == null){
			return result;
		}
		
		Stack<Integer> stack = new Stack<>();
		path(root, sum, stack);
		return  result;
	}
	public void path(TreeNode root,int sum,Stack<Integer> stack){
		stack.push(root.val);
		// find the correct leaf node
		if (root.left == null && root.right == null && sum == root.val){
			result.add(new ArrayList<>(stack));
		}
		if (root.left != null){
			path(root.left, sum - root.val, stack);
		}
		if (root.right != null){
			path(root.right, sum - root.val, stack);
		}
		stack.pop();
	}

}
