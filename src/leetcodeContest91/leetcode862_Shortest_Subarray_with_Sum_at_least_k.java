package leetcodeContest91;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年7月8日 下午5:33:47
* 类说明: 寻找A数组的最短的子数组，sum >= K,
*/
public class leetcode862_Shortest_Subarray_with_Sum_at_least_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Deque<Integer> deque = new LinkedList<>();
//		deque.push(1);
//		deque.addLast(2);
//		System.out.println(deque.remove());
		
		int[] A = {84,-37,32,40,95};
		// B[] --> 0 1 3 6 10 11 18   -1 2 3--0 -1 1 4 
		System.out.println(shortestSubarray2(A, 167));
		String string = "1";
		char c = 'a';
		System.out.println(Byte.SIZE);
		  
	}
	public static int shortestSubarray(int[] A, int K) {
		 int N = A.length, res = N + 1;
	        int[] B = new int[N + 1];
	        for (int i = 0; i < N; i++) B[i + 1] += B[i] + A[i];
	        Deque<Integer> d = new ArrayDeque<>();
	        for (int i = 0; i < N + 1; i++) {
	            while (d.size() > 0 && B[i] - B[d.getFirst()] >=  K) {
	            	res = Math.min(res, i - d.pollFirst());
	            }
	            while (d.size() > 0 && B[i] <= B[d.getLast()]) {
	            	d.pollLast();
	            }
	            d.addLast(i);
	        }
	        return res <= N ? res : -1;
    }
	public static int shortestSubarray2(int[] A, int K) {
		int res = A.length + 1;
		int[] B = new int[res];
		for (int i = 0; i < res - 1; i++) {
			B[i + 1] = B[i] + A[i];
		}
		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < B.length; i++) {
			while (!list.isEmpty() && (B[i] - B[list.get(0)] >= K)) {
				res = Math.min(res, i - list.get(0));
				list.remove(0);
			}
			while (!list.isEmpty() && B[i] < B[list.get(list.size() - 1)]) {
				list.remove(list.size() - 1);
			}
			list.add(i);
			
		}
		if (res == B.length) {
			return -1;
		}
		else {
			return res;
		}
	}

	
}
