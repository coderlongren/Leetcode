import java.util.LinkedList;
import java.util.Queue;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月17日 下午11:01:45
* 类说明: 
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
	// 直接参考网上大神的做法了，精巧的递归, 
	// 做之前，先仔细观察这棵树， 题意是很迷惑性的
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
	// 既然是遍历， 那么就有递归非递归之分
	public void connect2(TreeLinkNode root) {
		if (root == null) {
			return;
		}
		// 我们可以利用一个queue，来巧妙地遍历每一层节点
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
