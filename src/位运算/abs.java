package 位运算;

import java.lang.annotation.Retention;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月27日 下午12:16:07
* 类说明: 
*/
public class abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(abs(5));
	}
	public static int abs(int a){
		int b = a>>31; //获取符号位
		return (a + b)^b; // 正数 b = 0; 负数 b = -1 
		
	}

}
