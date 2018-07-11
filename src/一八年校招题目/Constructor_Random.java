package 一八年校招题目;

import java.util.Random;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月26日 下午9:57:12
* 类说明: 
*/
public class Constructor_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int[] arr = new int[8];
		while (i < 1000000) {
			arr[random_7()]++;
			i++;
		}
		for (int x: arr) {
			System.out.print(x + ",");
		}
	}
	public static int random_7() {
		// 先把 1-3 --> 1-9
		int ran = 8;
		while (ran >= 8) {
			ran = (random_3() - 1)*3 + random_3();
		}
		return ran;
		
	}
	public static int random_3() {
		Random random = new Random();
		return random.nextInt(3) + 1;
	}

}
