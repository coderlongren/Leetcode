import java.util.TreeMap;

import AlgortithmDesign.nQueue;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��7��16�� ����11:55:42
* ��˵��: 
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
		// һ���� ��A�����Ԫ��ȫ��������TreeMap�Ľṹ�У�Key�Ѿ��������
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
