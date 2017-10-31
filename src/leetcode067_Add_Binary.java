
public class leetcode067_Add_Binary {

	public static void main(String[] args) {
		String a = "1";
		String b = "111";
		System.out.println(addBinary(a, b));
	}
    public static String addBinary(String a, String b) {
        
    	StringBuilder result = new StringBuilder();
    	int lenA = a.length() - 1;
    	int lenB = b.length() - 1;
    	//保存进位 
    	int carry = 0;
    	
    	while (lenA >= 0 || lenB >= 0){
    		//保存两个二进制数字之和 
    		int sum = carry;
    		if (lenA >= 0){
    			sum += (a.charAt(lenA) - '0');
    			lenA--;
    		}
    		if (lenB >= 0){
    			sum += b.charAt(lenB) - '0';
    			lenB--;
    		}
    		result.append(sum %2);
    		carry = sum/2;
    	}
    	if (carry != 0){
    		result.append(carry);
    	}
    	result.reverse();
    	return result.toString();
    }

}
