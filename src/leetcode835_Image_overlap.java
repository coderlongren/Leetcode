import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��5��13�� ����10:40:32
* ��˵��: 
*/
public class leetcode835_Image_overlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	 public int largestOverlap(int[][] A, int[][] B) {
	        int N = A.length;
	        List<Integer> LA = new ArrayList<>();
	        List<Integer> LB = new ArrayList<>();
	        HashMap<Integer, Integer> count = new HashMap<>();
	        for (int i = 0; i < N * N; ++i) if (A[i / N][i % N] == 1) LA.add(i / N * 100 + i % N);
	        for (int i = 0; i < N * N; ++i) if (B[i / N][i % N] == 1) LB.add(i / N * 100 + i % N);
	        for (int i : LA) for (int j : LB)
	                count.put(i - j, count.getOrDefault(i - j, 0) + 1);
	        int res = 0;
	        for (int i : count.values()) res = Math.max(res, i);
	        return res;
	 }

}
