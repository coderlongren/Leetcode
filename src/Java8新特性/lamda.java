package Java8������;

import java.util.HashMap;
import java.util.Map;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��21�� ����8:44:56
* ��˵��: 
*/
public class lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,4,2};
		int k = 5;
		countSort(A, k);
		for (int i : A) {
			System.out.print(i + " ");
		}
		
		
	}
	public static void countSort(int[] A , int k){
        //��ʼ��count����
        int[] count = new int[k];
        //Ϊ����������ÿ��Ԫ�ؼ���
        for(int i : A)
            count[i]++;
        //���������֮ǰԪ�ص��ܺ�
        for(int i = 1; i < k; i++) 
            count[i] = count[i] + count[i-1];
        //��ʼ��һ���µ�������������Ԫ��
        int[] B = new int[A.length];
        for(int j = A.length-1; j >= 0; j--){
            //��A[j]�ŵ���Ӧ��λ��
            B[count[A[j]]-1] = A[j];
            //��������һ
            count[A[j]]--;
        }
        System.arraycopy(B,0, A, 0,A.length);
    }

}
