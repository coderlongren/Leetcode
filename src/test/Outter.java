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
	static int b = 2;
	static class Inner{
		public Inner() {
//			System.out.println(a); // ������󣬲��ܷ����ⲿ��ĳ�ԭ����
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
//		Executors.newFixedThreadPool(5)
	}
}
