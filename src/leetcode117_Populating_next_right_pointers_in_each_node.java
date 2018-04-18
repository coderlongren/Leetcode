import java.util.LinkedList;
import java.util.Queue;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��18�� ����10:42:48
* ��˵��: 
*/
public class leetcode117_Populating_next_right_pointers_in_each_node {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// �������ǰһ����Ŀ��ʹ�÷ǵݹ�Ĳ�α����� ������˻�����������⣬
	// ��һ���Ὺ�ĵ�AC������Ϊ�����Ŀ���ǿ��� ����ݹ����� ����֮��
	public void connect(TreeLinkNode root) {
		if (root == null) {
			return;
		}
		Queue<TreeLinkNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeLinkNode front = queue.poll();
				if (i < size - 1) {
					front.next = queue.element();
				}
				if (front.left != null) {
					queue.offer(front.left);
				} 
				if (front.right != null) {
					queue.offer(front.right);
				}
			}
		}
    }

}
