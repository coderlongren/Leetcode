/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月22日 上午11:47:36
* 类说明: 
*/
public class leetcode029_Divide_two_integer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int divide(int dividend, int divisor) {
		
		// 记录最后结果的符号
		int sign = 1;
		if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
			sign = -1;
		}
		
		// 将输入的数字 转化为 long防止溢出
		long dividend2 = Math.abs(dividend);
		long divisor2 = Math.abs(divisor);
		
		// 小心边界值
		if (dividend2 == 0 || (dividend2 < divisor2)) {
			return 0;
		}
		if (divisor2 == 0) {
			
		}
		return sign;
		
	}

}
