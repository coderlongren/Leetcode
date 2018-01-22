/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月20日 下午2:17:13
* 类说明:  没有AC 因为没有考虑Integer的溢出，而且里面的逻辑代码写的也是很混乱，
*/
public class leetcode029_Divide_two_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(29, -1));
		System.out.println(Math.abs(-2147483648));
	}
	//  3*8=24  28/3 ---> 24 ,4/3 --->1  ---> 1结束   
	public static int divide(int dividend, int divisor) {
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
			return Integer.MAX_VALUE;
		}
		
        long  result = 0;
        while (dividend2 >= divisor2){
        	long d = divisor2;
        	long temp = 1; // 用来保存 临时的倍数
        	// 
        	while (dividend > d << 1){
        		d = d << 1; // d 每次扩大二倍，
        		if (d > Integer.MAX_VALUE || d < Integer.MIN_VALUE){
        			return Integer.MAX_VALUE;
        		}
        		temp = temp << 1; //
        	}
        	result += temp;
        	dividend2 -= d;
        }
        return (int) result*sign;
    }
	

}
