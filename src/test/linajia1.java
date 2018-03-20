package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月19日 下午7:00:50
* 类说明: 
*/
public class linajia1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		Set<Tree> set = new HashSet<>();
		for (int i = 0; i < N - 1; i++) {
			int u = scanner.nextInt();
			int v = scanner.nextInt();
			int c = scanner.nextInt();
			Tree tree = new Tree(u, v, c);
			set.add(tree);
		}
		List<Integer> res = new ArrayList<>();
		int Q = scanner.nextInt();
		for (int i = 0; i < Q; i++) {
			int tempU = scanner.nextInt();
			int tempV = scanner.nextInt();
			res.add(findMax(tempU, tempV, set));
		}
		for (int i : res) {
			System.out.println(i);
		}
	}
	public static int findMax (int u, int v, Set<Tree> set) {
		List<Integer> list = new ArrayList<>();
		for (Tree tree : set) {
			find(tree, u, v, list, new ArrayList<>());
		}
		int max = Integer.MIN_VALUE;
		for (int i : list) {
			max = Math.max(max, i);
		}
		return max;
	}
	public static void find(Tree tree, int start, int end, List<Integer> list, List<Integer> temp) {
		
		if (start == end) {
			list.addAll(temp);
			return;
		}
		if (tree.num1 == start) {
			temp.add(tree.val);
			find(tree, tree.num2, end, list, temp);
		}
		else if (tree.num2 == start) {
			temp.add(tree.val);
			find(tree, tree.num1, end, list, temp);
		}
		else {
			return;
		}
		
	}
}
class Tree {
	int num1;
	int num2;
	int val;
	Tree(int num1, int num2,int val) {
		this.num1 = num1;
		this.num2 = num2;
		this.val = val;
	}
	
}