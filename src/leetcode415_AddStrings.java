
public class leetcode415_AddStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String addStrings(String num1, String num2) {
        
		StringBuilder stringBuilder = new StringBuilder();
		int len1 = num1.length();
		int len2 = num2.length();
		//进位
		int carry = 0;
		//最简洁的算法
		for (int i = len1 - 1,j = len2 - 1; i >=0 || j >= 0; i--,j--){
			int sum = carry;
			if (i >= 0){
				sum += num1.toCharArray()[i] - '0';
			}
			if (j >= 0){
				sum += num2.toCharArray()[j] - '0';
			}
			stringBuilder.append(sum%10);
			carry = sum/10;
		}
		
		if (carry != 0){
			stringBuilder.append(carry);
		}
		stringBuilder.reverse();
		
		return stringBuilder.toString();
    }

}
