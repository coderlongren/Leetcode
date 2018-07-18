import java.util.TreeMap;

import AlgortithmDesign.nQueue;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年7月16日 上午11:55:42
* 类说明: 
*/
public class leetcode870_Advantage_Shuffle {
	public static void main(String[] args) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		map.put(1, 1);
		map.put(5, 2);
		map.put(3, 2);
//		for (int key : map.keySet()) {
//			System.out.println(key);
//		}
		
		System.out.println(map.higherKey(5));
		
	}
	public int[] advantageCount(int[] A, int[] B) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		// 一次性 把A数组的元素全部保存在TreeMap的结构中，Key已经是排序的
		for (int i = 0; i < A.length; i++) {
			map.put(A[i], map.getOrDefault(A[i], 0) + 1);
		}
		int[] res = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			int key = map.higherKey(B[i]) == null ? map.firstKey() : map.higherKey(B[i]);
			res[i] = key;
			map.put(key, map.get(key) - 1);
			if (map.get(key) == 0) {
				map.remove(key);
			}
		}
		return res;
		
	}
	
}
