package leetcodeContest73;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��10�� ����10:04:10
* ��˵��: 
*/
public class leetcode788_rotated_digits {
	public int rotatedDigits(int N) {
        int count = 0;
        for (int i = 2; i <= N; i++) {
        	if (isValid(i)) {
        		count++;
        	}
        }
        return count;
    }
	public boolean isValid(int N) {
		boolean valid = false;
		while (N > 0) {
			// 3 4 7 һ�����֣��϶�����rotated, 0 1 8 ������ν��, 2,5,6,9,һ�����־��ǿ�����ת��
			if (N%10 == 2) {
				valid = true;
			}
			else if (N%10 == 5) {
				valid = true;
			}
			else if (N%10 == 6) {
				valid = true;
			}
			else if (N%10 == 9) {
				valid = true;
			}
			else if (N%10 == 3) {
				return false;
			}
			else if (N%10 == 4) {
				return false;
			}
			else if (N%10 == 7) {
				return false;
			}
			N /= 10;
		}
		return valid;
	}
}
