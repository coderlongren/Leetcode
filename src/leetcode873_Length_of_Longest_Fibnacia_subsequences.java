import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��7��23�� ����11:23:27
* ��˵��: 
*/
public class leetcode873_Length_of_Longest_Fibnacia_subsequences {
	public static void main(String[] args) {
		int[] A = {1,3,7,11,12,14,18};
		System.out.println(lenLongestFibSubseq(A));
		
	}
	// ������ֱ��ʹ���ˣ������ķ�����ȡ A����� 쳲���������
	public static int lenLongestFibSubseq(int[] A) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {
        	int start = A[i];
        	if (i > max) {
        		return max;
        	}
        	for (int j = i + 1; j < A.length; j++) {
        		List<Integer> list = new ArrayList<>();
        		int a = start;
        		int b = A[j];
        		list.add(a);
        		list.add(b);
        		for (int k = j + 1; k < A.length; k++) {
        			int c = a + b;
        			if (A[k] == c) {
        				list.add(c);
        				a = b;
        				b = c;
        				max = Math.max(max, list.size());
        			}
        		}
        	}
        }
        return max;
    }
}
