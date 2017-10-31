
public class leetcode258_AddDigits {
/***
 *  Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime? 
 * @param args
 */
	public static void main(String[] args) {
		System.out.println(addDigits(123));

	}
	public static int addDigits(int num){
		if (num >= 0 && num < 10){
			return num;
		}
		else {
			int sum = 0;
			char[] test = (num + "").toCharArray();
			for (int i=0; i < test.length; i++){
				sum += test[i] - '0';
			}
			return 	addDigits(sum);
		}
		
	}

}
