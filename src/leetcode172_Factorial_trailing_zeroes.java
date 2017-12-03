
public class leetcode172_Factorial_trailing_zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(11));
		System.out.println(trailingZeroes(11));
	}
	// ���� 0�ĸ��� ��ʵ���� 2*5��������2����Ŀ ԶԶ����5�ĸ����� 
	// �õ��� ע�� 25 ������5 ��125������5.��������������������
	 public static int trailingZeroes(int n) {
		 if (n == 0){
			 return 0;
		 }
		 return n/5 + trailingZeroes(n/5);
	 }
	 public static int factorial(int n){
		 if (n == 1){
			 return 1;
		 }
		 return n*factorial(n - 1);
	 }
}
