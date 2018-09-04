import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月28日 下午7:05:55
* 类说明: 
*/
public class hao1 {
	public static void main(String[] args) {
		
	}
	public static int kth(long x, long k) {
		int y = 1;
		while (k > 0) {
			long temp = x | y;
			if (temp == (x + y)) {
				k--;
			}
			y++;
		}
		return y - 1;
	}
}
