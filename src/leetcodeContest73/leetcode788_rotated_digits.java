package leetcodeContest73;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月10日 上午10:04:10
* 类说明: 
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
			// 3 4 7 一旦出现，肯定不能rotated, 0 1 8 是无所谓的, 2,5,6,9,一旦出现就是可以旋转的
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
