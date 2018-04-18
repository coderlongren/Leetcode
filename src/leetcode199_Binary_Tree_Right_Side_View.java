import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月18日 下午3:58:39
* 类说明:  一次AC的题目，
*/
public class leetcode199_Binary_Tree_Right_Side_View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 其实转化为 求每层的 最右边的节点
	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
        	return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
        	int size = queue.size();
        	for (int i = 0; i < size - 1; i++) {
        		TreeNode temp = queue.poll();
        		if (temp.left != null) {
        			queue.offer(temp.left);
        		}
        		if (temp.right != null) {
        			queue.offer(temp.right);
        		}
        	}
        	TreeNode last = queue.poll();
        	res.add(last.val);
        	if (last.left != null) {
        		queue.offer(last.left);
        	}
        	if (last.right != null) {
        		queue.offer(last.right);
        	}
        }
		return res;
        
    }
	

}
