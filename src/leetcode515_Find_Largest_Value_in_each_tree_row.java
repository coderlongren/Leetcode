import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月30日 下午9:27:32
* 类说明: 一次AC
*/
public class leetcode515_Find_Largest_Value_in_each_tree_row {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 1;
		Queue<Integer> queue = new LinkedList<>();
	}
	public static List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) {
        	return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
        	int i = 0;
        	int size = queue.size();
        	int max = Integer.MIN_VALUE;
        	while (i < size) {
        		TreeNode temp = queue.poll();
        		max = Math.max(max, temp.val);
        		if (temp.left != null) {
        			queue.offer(temp.left);
        		}
        		if (temp.right != null) {
        			queue.offer(temp.right);
        		}
        		i++;
        	}
        	res.add(max);
        }
		return res;
    }

}
