
public class leetcode191_number_of_1bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingWeight(11));
	}
	public static int hammingWeight(int n) {
        String string = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < string.length(); i++){
        	if (string.charAt(i) == '1'){
        		count++;
        	}
        }
        return count;
    }

}
