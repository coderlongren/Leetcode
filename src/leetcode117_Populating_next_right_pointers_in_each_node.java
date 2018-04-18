import java.util.LinkedList;
import java.util.Queue;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月18日 上午10:42:48
* 类说明: 
*/
public class leetcode117_Populating_next_right_pointers_in_each_node {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 如果你在前一道题目中使用非递归的层次遍历， 来解决了话，我想这道题，
	// 你一定会开心的AC掉，因为这道题目正是考虑 上题递归解决的 困难之处
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
