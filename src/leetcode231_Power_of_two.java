
public class leetcode231_Power_of_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfTwo(64));
		System.out.println(Integer.bitCount(5));
		System.out.println(3 & 4);
	}
	// 判断一个数 是不是2的幂
	public static boolean isPowerOfTwo(int n){
		boolean flag = true;
		if (n < 1){
			return false;
		}
		if (n == 1){
			return true;
		}
		while (n > 1){
			if (n%2 != 0){
				flag = false;
				break;
			}
			n = n/2;
		}
		return flag;
	}

}
