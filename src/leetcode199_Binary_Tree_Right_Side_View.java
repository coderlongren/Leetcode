import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��18�� ����3:58:39
* ��˵��:  һ��AC����Ŀ��
*/
public class leetcode199_Binary_Tree_Right_Side_View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// ��ʵת��Ϊ ��ÿ��� ���ұߵĽڵ�
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
