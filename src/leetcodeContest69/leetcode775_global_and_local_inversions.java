package leetcodeContest69;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��28�� ����11:10:23
* ��˵��:  is just a joke ����ȫ��Ⱦɫ����ĿO(n^2) ���Բ���ͨ���� so.......
*/
public class leetcode775_global_and_local_inversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,0};
		System.out.println(isIdealPermutation(A));
	}
	public static boolean isIdealPermutation(int[] A) {
        int local_num = 0;
        int global_num = 0;
        if (A.length == 1) {
        	return true;
        }
        for (int i = 0; i < A.length - 1; i++) {
        	if (A[i] > A[i + 1]) {
        		local_num++;
        	}
        }
        for (int i = 0; i < A.length - 1; i++) {
        	for (int j = i + 1; j < A.length; j++) {
        		if (A[i] > A[j]) {
        			global_num++;
        		}
        	}
        }
        return global_num == local_num;
        
    }

}
