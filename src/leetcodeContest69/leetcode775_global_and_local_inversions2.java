package leetcodeContest69;

import java.util.Arrays;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��28�� ����11:22:30
* ��˵��: 
*/
public class leetcode775_global_and_local_inversions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean isIdealPermutation(int[] A) {
		for (int i = 0; i < A.length; i++) {
			// iԪ�� ����ԭ����λ��
			if (A[i] != i) {
				if (A[i + 1] == i && A[i] == i + 1) {
					i++;
				}
				else {
					return false;
				}
			}
		}
		return true;
    }

}
