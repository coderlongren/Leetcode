
public class leetcode204_Count_Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] notPrime = new boolean[5];
		System.out.println(notPrime[3]);
		System.out.println(countPrimes(3));
	}	
	public static int countPrimes(int n) {
        if (n <= 1){
        	return 0;
        }
        // ����  ɸ�� �������������㷨
        // Ĭ���������涼��false 
        boolean[] isPrime = new boolean[n];
		isPrime[0] = true;
		isPrime[1] = true;
        // ���i*i > nҲ����ζ�� ��i�Ժ��û�л�ȥ��Ԫ�� ��������
		for (int i = 2; i*i < n;i++){
			// ��һ�� ���� ����ȥȦ  ����λ��� ��������ı���
			if (!isPrime[i]){
				for (int j = 2;i*j < n; j++){
					// ��ȥ��Ԫ��
					isPrime[j*i] = true;
				}
			}
		}
        int count = 0;
        for (boolean b : isPrime) {
        	if (!b){
        		count++;
        	}
		}
        return count;
    }

}
