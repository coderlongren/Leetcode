package leetcodeContest92;

import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年7月11日 下午9:15:40
* 类说明: 
*/
public class leetcode867_primePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(primePalindrome(13));
//		for (int i = 0; i < Math.pow(10, 8); i++) {
//			System.out.println(i);
//		}
	}
	public static int primePalindrome(int N) {
        while (true) {
        	if (isPalindrome(N)) {
        		if (isPrime(N)) {
        			return N;
        		}
        	}
        	N++;
        }
    }
	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		int s = (int)Math.sqrt(n);
		for (int i = 2; i <= s; i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isPalindrome(int n) {
		if (n == 11) {
			return true;
		}
		String ori = "" + n;
		if (ori.length()%2 == 0) {
			return false;
		}
		else {
			StringBuilder builder = new StringBuilder("" + n);
    		String trans = builder.reverse().toString();
    		if (ori.equals(trans)) {
    			return true;
    		}
    		return false;
		}
	}

}
