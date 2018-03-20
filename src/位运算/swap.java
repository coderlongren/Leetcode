package 位运算;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月27日 下午12:12:12
* 类说明: 
*/
public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 1;
		Integer b = 2;
		swap(a, b);
		System.out.println(a);
		System.out.println(b);
	}
	public static void swap(Integer a, Integer b) {
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println(a);
		System.out.println(b);
	}

}
