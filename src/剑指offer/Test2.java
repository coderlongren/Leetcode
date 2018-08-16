package 剑指offer;

import java.util.Scanner;
import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月14日 下午10:33:52
* 类说明: 
*/
public class Test2 {
	public static void main(String[] args) {
		System.out.println(maxSum());
	}
	public static int maxSum() {
		int[][] arr = {{3,1},{2,2},{1,4},{1,4}};
		int[][] res = new int[10000][10000];
		Stack<num> stack = new Stack<>();
		for (int[] item : arr) {
			int a = item[0];
			int b = item[1];
			Stack<num> temp = new Stack<>();
			num num1 = new num(a, 0);
			num num2 = new num(0, a);
			temp.push(num1);
			temp.push(num2);
			res[a][0] = Math.max(res[a][0], b);
			res[0][a] = Math.max(res[0][a], b);
//			System.out.println(res[a][0]);
//			System.out.println(res[0][a]);
			int count = 1;
			for (num x : stack) {
				int pre_x = x.x;
				int pre_y = x.y;
				res[pre_x + a][pre_y] = res[pre_x][pre_y] + b;
				res[pre_x][pre_y + a] = res[pre_x][pre_y] + b;
			}
			while (!stack.isEmpty()) {
				num pre = stack.pop();
				temp.push(pre);
				int pre_x = pre.x;
				int pre_y = pre.y;
//				res[pre_x + a][pre_y] = res[pre_x][pre_y] + b;
//				res[pre_x][pre_y + a] = res[pre_x][pre_y] + b;
////				System.out.println(res[pre_x + a][pre_y]);
////				System.out.println(res[pre_x][pre_y + a]);
				temp.push(new num(pre_x + a, pre_y));
				temp.push(new num(pre_x, pre_y + a));
			}
			stack = temp;
		}
		int max = Integer.MIN_VALUE;
//		for (int i = 0; i < 10000; i++) {
//			if (res[i][i] == 18) {
//				System.out.println(i + "," + i);
//			}
//		}
		System.out.println(res[2][2]);
		return max;
		
	}
}
class num {
	int x;
	int y;
	public num(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
