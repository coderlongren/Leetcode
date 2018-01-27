package 位运算;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月27日 下午12:08:35
* 类说明:  巧妙的利用了半加器的原理
*/
public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(average(6, 4));
	}
	public static int average(int a, int b) {
		return (a&b) + ((a^b)>>1);
	}

}
