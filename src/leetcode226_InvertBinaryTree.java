import java.util.LinkedList;
import java.util.Queue;
import java.util.PrimitiveIterator.OfDouble;
public class leetcode226_InvertBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// in this we use the solution BFS
	public  static TreeNode invertTree(TreeNode root) {
		if (root == null){
			return null;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while (!queue.isEmpty()){
			int size = queue.size();
			TreeNode tempNode = queue.poll();
			TreeNode leftNode = tempNode.left;
			tempNode.left = tempNode.right;
			tempNode.right = leftNode;
			if (tempNode.left != null){
				queue.offer(tempNode.left);
			}
			if (tempNode.right != null){
				queue.offer(tempNode.right);
			}
		}
		return root;
	}

}
