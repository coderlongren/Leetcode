package leetcodeContest70;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��6�� ����5:47:28
* ��˵��:  ��� �ӵ������㣬��string�ܴ��ʱ�򣬻�MemberOutOf, �����뵽��� K_th char
* �� ���ڼ������޹صģ�ÿһ��K(ż����ת��Ϊ����)  ������һ�е�(K/2 + 1)�ɴ˵ó��ݹ�Ľⷨ
*/
public class leetcode779_Kth_Symbol_in_Grammar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(kthGrammar(4, 5));
	}
	public static int kthGrammar(int N, int K) {
		return search(N, K);
	}
	 public static int search(int N, int K) {
		 if (N == 1) {
			 return 0;
		 }
		 
		 if (K%2 == 1) {
			 return search(N - 1, K/2 + 1);
		 }
		 else {
			 if (search(N - 1, (K - 1)/2 + 1) == 0) {
				 return 1;
			 }
			 else {
				 return 0;
			 }
		 }
	 }

}
