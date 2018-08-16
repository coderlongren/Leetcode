package 剑指offer;

import java.util.ArrayList;
import java.util.List;

import leetcodeContest62.TreeNode;
import test.linajia1;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月4日 下午4:41:30
* 类说明: 
*/
public class ConstructBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
//		System.out.println(list.indexOf(5));
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		TreeNode root = reConstructBinaryTree(pre, in);
		System.out.println("ssd");
	}
	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		List<Integer> pre_list = new ArrayList<>();
		List<Integer> in_list = new ArrayList<>();
		for (int item : pre) {
			pre_list.add(item);
		}
		for (int item : in) {
			in_list.add(item);
		}
		if (pre_list.size() == 0 || in_list.size() == 0) {
			return null;
		}
		return construct(pre_list, in_list);
	}
	public static TreeNode construct(List<Integer> pre, List<Integer> in) {
		if (pre.size() == 0 || in.size() == 0) {
			return null;
		}
		TreeNode root = new TreeNode(pre.get(0));
		int index = in.indexOf(pre.get(0));
		pre.remove(0);
		List<Integer> in_left = new ArrayList<>();
		List<Integer> in_right = new ArrayList<>();
		for (int i = 0; i < index; i++) {
			in_left.add(in.get(i));
		}
		for (int i = index + 1; i < in.size(); i++) {
			in_right.add(in.get(i));
		}
		root.left = construct(pre, in_left);
		root.right = construct(pre, in_right);
		return root;
		
	}
	

}
