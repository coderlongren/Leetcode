package DP;

import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月7日 下午2:06:20
* 类说明: 
*/
public class UglyNumber {
	public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution(5));
	}
	public static int GetUglyNumber_Solution(int index) {
		if (index <= 0) {
			return 0;
		}
		int i2 = 0;
		int i3 = 0;
		int i5 = 0;
		int[] result = new int[index];
		result[0] = 1; // 第一个丑数是1
		int count = 0;
		while (count < index - 1) {
			int temp = Math.min(result[i2]*2, Math.min(result[i3]*3, result[i5]*5));
			if (temp == result[i2]*2) {
				i2++;
			}
			if (temp == result[i3]*3) {
				i3++;
			}
			if (temp == result[i5]*5) {
				i5++;
			}
			result[++count] = temp;
		}
		return result[index - 1];
	}
}
