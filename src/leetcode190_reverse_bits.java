
public class leetcode190_reverse_bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(2<<1);
//		System.out.println(125&1);
		System.out.println(Integer.toBinaryString(6));
		System.out.println(reverseBits(6));
	}
	public static int reverseBits(int n) {
	    int result = 0;
	    for (int i = 0; i < 32; i++) {
	        result += n & 1;
	        n >>>= 1;   // CATCH: must do unsigned shift
	        if (i < 31) // CATCH: for last digit, don't shift!
	            result <<= 1;
	    }
	    return result;
	}

}
