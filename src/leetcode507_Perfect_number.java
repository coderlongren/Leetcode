/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��4�� ����10:11:32
* ��˵��:  ��һ���ύʱ  ��ʱ�ˣ����Ի���
*/
public class leetcode507_Perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPerfectNumber(28));
		System.out.println(Math.sqrt(4));
	}
	public static boolean checkPerfectNumber(int num) {
        if (num == 1){
        	return false;
        }
        int sum = 0;
        for (int i = 2; i <= Math.sqrt(num); i++){
        	// Ϊ�˱��ⳬʱ�� ������sqrt(num)������
        	if (num%i == 0){
        		sum += i;
        		if (i != num/i){
        			sum += num/i;
        		}
        	}
        }
        sum++;
        if (sum == num){
        	return true;
        }
        else {
        	return false;
        }
		
    }

}
