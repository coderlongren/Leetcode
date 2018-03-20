package JVM测试;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月17日 下午8:12:17
* 类说明: 
*/
public class Java语法糖 {
	public static void main(String[] args) {
//		Integer i1=10;
//		Integer i2=10;
//		Integer i3=20;
//		Integer i11=new Integer(10);
//		Integer i22=new Integer(10);
//		Integer i33=new Integer(20);
//		
//		System.out.println(i1==i2); // true
//		System.out.println(i1==i11); // false 比较对象
//		System.out.println(i11==i22); // false
//		System.out.println(i3==(i1+i2)); // true 包装类一旦遇到了 算术运算符可是会自动拆箱的
//		System.out.println(i3==(i11+i22));// true 包装类一旦遇到了 算术运算符可是会自动拆箱的
//		System.out.println(i33==(i1+i2));// true 包装类一旦遇到了 算术运算符可是会自动拆箱的
//		System.out.println(i33==(i11+i22));// true 包装类一旦遇到了 算术运算符可是会自动拆箱的
//		
		
		
		String s1="abc1";//此处是数字1
		String s2="abc"+1;
		System.out.println(s1==s2);// 第一次比较
		String s3="ab";
		String s4="c";
		String s5="abc";
		String s6=s3+s4;
		System.out.println(s5==s6);// 第二次比较
	}
}
