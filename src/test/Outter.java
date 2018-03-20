package test;

import java.util.Collections;
import java.util.concurrent.Executors;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月18日 下午7:18:23
* 类说明: 
*/
public class Outter {
	int a  = 10; 
	static int b = 2;
	static class Inner{
		public Inner() {
//			System.out.println(a); // 编译错误，不能访问外部类的成原变量
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
//		Executors.newFixedThreadPool(5)
	}
}
