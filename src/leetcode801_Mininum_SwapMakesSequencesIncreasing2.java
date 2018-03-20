/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��20�� ����10:45:13
* ��˵��: 
*/
public class leetcode801_Mininum_SwapMakesSequencesIncreasing2 {
	public static int minSwap(int[] A, int[] B) {
		//  ����˵ Ҫ��DP�����
		// DP ���������أ� 
		int n1 = 0; //  ni��ʾ  n(i-1)����Ҫ�������Ѿ����������
		int s1 = 1; // si ����s(i-1) ��i - 1������һ�ξ�������
		// ��ô �����Ʋ⣬ n1 = 0 s1 = 1 �����ԣ�index 0���϶��������
		// index o �� ����һ�ο϶�Ҳ������ģ� ��Ϊ�����ǵ�һ��Ԫ����
		
		for (int i = 1; i < A.length; i++) {
			// �������Ʋ� n2 s2�Ĺ���
			int n2 = Integer.MAX_VALUE;
			int s2 = Integer.MAX_VALUE;
			// 
			if (A[i - 1] < A[i] && B[i - 1] < B[i]) {
				n2 = Math.min(n2, n1);
				s2 = Math.min(s2, s1 + 1);
			}
			if (A[i - 1] < B[i] && B[i - 1] < A[i]) {
				n2 = Math.min(n2, s1);
				s2 = Math.min(s2, n1 + 1);
			}
			
			n1 = n2;
			s1 = s2;
		}
		return Math.min(n1, s1);
	}
	public static void main(String[] args) {
		int[] A = {1,3,5,4};
		int[] B = {1,2,3,7};
		System.out.println(minSwap(A, B));
	}
}
