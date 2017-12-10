package leetcodeContest62;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;


public class leetcode742_cloest_leaf_a_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// DFS + BFS ���ۺ�Ӧ�ã�
	public static int findClosestLeaf(TreeNode root, int k) {
		Map<TreeNode, TreeNode> backMap = new HashMap<>();
		Queue<TreeNode> queue = new LinkedList<>();// Ҫʹ��BFS ��Ҫ�õ�Queue
		Set<TreeNode> visited = new HashSet<>();
//		backMap.put(null, null);
		TreeNode kNode = DFS(root, k, backMap);
		queue.add(kNode);
		visited.add(kNode);
		// ʹ��queue BFS
		while (!queue.isEmpty()){
			TreeNode curr = queue.poll();
			if (curr.left == null && curr.right == null){
				return curr.val;
			}
			if (curr.left != null && visited.add(curr.left)){
				queue.add(curr.left);
			}
			if (curr.right != null && visited.add(curr.right)){
				queue.add(curr.right);
			}
			if (backMap.containsKey(curr) && visited.add(backMap.get(curr))){
				queue.add(backMap.get(curr));
			} 
		}
		
		
		return -1;
		
    }
	// ʹ��DFS ������val���� k�Ľڵ�  ����ͬʱ��backmap�洢ÿ�����ʹ��ýڵ�ĸ��ڵ�
	public static TreeNode DFS(TreeNode root,int k,Map<TreeNode, TreeNode> backMap){
		// how to find the node by DFS, now start learn........
		if(root.val == k){
			return root;
		}
		if (root.left != null){
			backMap.put(root.left, root);
			TreeNode left = DFS(root.left, k, backMap);
			if (left != null){
				return left;
			}
		}
		if (root.right != null){
			backMap.put(root.right, root);
			TreeNode right = DFS(root.right, k, backMap);
			if (right != null){
				return right;
			}
		}
		
		return null;
	}
	

}
