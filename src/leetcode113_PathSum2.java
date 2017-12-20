import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��20�� ����2:20:04
* ��˵��:  �����һ�ֽⷨ������ʹ��Stack<Integer>�ķ��� ��Ϊֱ�� ��DFS 
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
