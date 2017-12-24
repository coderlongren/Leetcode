package test;
/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月23日 下午12:12:00
* 类说明: 
*/
public class test {
	public static void main(String[] arg) {
		System.out.println(arg);
		Short s1 = 1;
		// 这里 s1 是不能直接加1的 1 是int，需要强转
		s1 = (short) (s1 + 1);
		// 3.5 是double  不能直接赋值 给f1
		float f1 = 3.5F;
		double d1 = 3.2;
		String string = "l love you";
		string = string.replace(" ", "");
		System.out.println(string);
	}
	
	
}
