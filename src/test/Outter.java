package test;

import java.util.Collections;
import java.util.concurrent.Executors;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��18�� ����7:18:23
* ��˵��: 
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
