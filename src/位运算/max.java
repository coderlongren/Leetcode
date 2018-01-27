package 位运算;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月27日 下午12:18:39
* 类说明: 
*/
public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(11, 3));
	}
	public static int max(int a, int b) {
		return a ^ (( a ^ b) & (a - b)>>31);
	}

}
