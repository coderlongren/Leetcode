import java.util.LinkedList;
import java.util.Queue;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��17�� ����11:01:45
* ��˵��: 
*/
public class leetcode116_Populating_next_right_Pointers_in_each_node {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		System.out.println(queue.element());
		System.out.println(queue.poll());
		System.out.println(queue.element());
	}
	// ֱ�Ӳο����ϴ���������ˣ����ɵĵݹ�, 
	// ��֮ǰ������ϸ�۲�������� �����Ǻ��Ի��Ե�
	public void connect(TreeLinkNode root) {
        if (root == null) {
        	return;
        }
        if (root.left != null) {
        	root.left.next = root.right;
        }
        if (root.right != null) {
        	root.right.next = (root.next == null? null : root.next.left);
        }
        connect(root.left);
        connect(root.right);
    }
	// ��Ȼ�Ǳ����� ��ô���еݹ�ǵݹ�֮��
	public void connect2(TreeLinkNode root) {
		if (root == null) {
			return;
		}
		// ���ǿ�������һ��queue��������ر���ÿһ��ڵ�
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
