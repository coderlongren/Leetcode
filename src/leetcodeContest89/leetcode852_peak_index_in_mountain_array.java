package leetcodeContest89;

import java.util.HashMap;
import java.util.Map;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��6��17�� ����9:33:01
* ��˵��: 
*/
public class leetcode852_peak_index_in_mountain_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int peakIndexInMountainArray(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
        	map.put(A[i], i);
        	max = Math.max(max, A[i]);
        }
        return map.get(max);
    }

}
