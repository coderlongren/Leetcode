package leetcodeContest91;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import AVL.Tree;
import leetcodeContest71.TreeNode;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年7月1日 上午10:18:17
* 类说明: 
*/
public class leetcode863_All_Nodes_Distance_k_in_binary_tree {
	Map<Integer, List<Integer>> map = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(8);
		leetcode863_All_Nodes_Distance_k_in_binary_tree test = new leetcode863_All_Nodes_Distance_k_in_binary_tree();
		TreeNode target = new TreeNode(5);
		test.distanceK(root, target, 2);
		
	}
	public  List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
		List<Integer> bfs = new ArrayList<>();
		bfs.add(target.val);
		makeMap_with_recus(null, root);
		if (map.isEmpty()) {
			return null;
		}
		Set<Integer> visit = new HashSet<>(bfs);
		for (int i = 0; i < K; i++) {
			List<Integer> temp = new ArrayList<>();
			for (Integer item : bfs) {
				for (int val : map.get(item)) {
					if (!visit.contains(val)) {
						temp.add(val);
					}
				}
			}
			bfs = new ArrayList<>(temp);
			visit.addAll(temp);
		}
		
		
		return bfs;
    }
	public  void makeMap_with_recus(TreeNode parent, TreeNode child) {
		if (parent != null && child != null) {
			if (map.containsKey(parent.val)) {
				map.get(parent.val).add(child.val);
			}
			else {
				List<Integer> list = new ArrayList<>();
				list.add(child.val);
				map.put(parent.val,list);
			}
			
			if (map.containsKey(child.val)) {
				map.get(child.val).add(parent.val);
			}
			else {
				List<Integer> list = new ArrayList<>();
				list.add(parent.val);
				map.put(child.val,list);
			}
		}
		if (child.left != null) {
			makeMap_with_recus(child, child.left);
		}
		if (child.right != null) {
			makeMap_with_recus(child, child.right);
		}
	}

}
