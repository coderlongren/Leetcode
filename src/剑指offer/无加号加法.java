package 剑指offer;

import java.math.BigInteger;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月10日 下午12:00:57
* 类说明: 
*/
public class 无加号加法 {
	public static void main(String[] args) {
		System.out.println(add2(1, 2));
		System.out.println(10^2);
		System.out.println(10&2);
	}
	// 和岂不是在投机取巧吗？ 哈哈
	public static int add(int num1, int num2) {
		BigInteger integer1 = new BigInteger(String.valueOf(num1));
		BigInteger integer2 = new BigInteger(String.valueOf(num2));
		return integer1.add(integer2).intValue();
	}
	// 还是老老实实的位运算把
	public static int add2(int num1, int num2) {
		while (num2 != 0) {
			int temp = num1^num2;
			num2 = (num1&num2)<<1;
			num1 = temp;
		}
		return num1;
	}
}
