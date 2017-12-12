/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月12日 下午8:47:21
* 类说明: 
*/
public class leetcode342_Power_of_four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Integer.toBinaryString(16));
		System.out.println(Integer.valueOf("10000",2));
		System.out.println(4 & 0x55555555);
	}
	public static boolean isPowerOfFour(int num) {
		// 如何判断一个数 是4的整数次幂 而不是2的整数次幂呢？
		// 思考一下吧 任同学
        return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
    }

}
