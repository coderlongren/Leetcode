import java.util.LinkedList;
import java.util.Queue;

public class leetcode404_Sum_Of_Left_Leaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// �� ÿ�ζ����ڹؼ���ʱ�� û��˼·�� 
	// �����Ŀ �Ǻܼ򵥵� ʹ��BFS 
	// �ؼ��� ����ж�һ���ڵ� �ǲ������ӽڵ�
	
	 public static int sumOfLeftLeaves(TreeNode root) {
	     if (root == null){
	    	 return 0;
	     }   
	     int sum = 0;
	     Queue<TreeNode> queue = new LinkedList<TreeNode>();
	     queue.offer(root);
	     
	     while (!queue.isEmpty()){
	    	 // ������һ�� 
	    	 TreeNode tempNode = queue.poll();
	    	 //  �ڸ��ڵ���� ���������Һ��Ӷ�Ϊnull ����Ҷ�ӽڵ�
	    	 if (tempNode.left != null && tempNode.left.left == null && tempNode.left.right == null){
	    		 sum += tempNode.left.val;
	    	 }
	    	 if (tempNode.left != null){
	    		 queue.offer(tempNode.left);
	    	 }
	    	 if (tempNode.right != null){
	    		 queue.offer(tempNode.right);
	    	 }
	     }
	     return sum;
	 }
}
