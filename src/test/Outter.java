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
	class Inner{
		int b;
		public Inner(int b) {
			this.b = b;
		}
		public void test() {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
//		Executors.newFixedThreadPool(5)
		Outter outter = new Outter();
		Inner in = outter.new Inner(2);
		in.test();
		
		int i = 2 + 2;
	}
}
