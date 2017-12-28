/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月28日 下午1:18:40
* 类说明:  注意是 从1 开始第n个数字，而不是数，不小心就会看不懂题意
*/
public class leetcode400_Nth_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Math.ceil(3.2));
//		System.out.println(Math.floor(3.2));
//		System.out.println(Math.round(3.2));
		int n = 10;
		System.out.println(findNthDigit(n));
		
		
	}
	public static int findNthDigit(int n) {
		
		//  先定位到时 几位数字
		int digitType = 1;
		long digitNum = 9;
		while (n > digitNum*digitType){
			n -= digitNum*digitType;
			digitType += 1;
			digitNum *= 10;
		}
		
		int i = (int) ((n - 1)/digitType);
		int j = (int)((n - 1)%digitType);
		// 第几位的 第一个数
		int start = (int) (1*Math.pow(10, digitType - 1)) + i;
//		for ()
		String result = start + "";
		char c = result.charAt(j);
		return c - '0';
        
    }
}
