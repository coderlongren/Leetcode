package 牛客coder;

import java.util.Arrays;
import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月7日 上午10:32:46
* 类说明:  可劲坑我
*/
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int temp = N;
		double[] nums = new double[3];
		for (int i = 0; i < 3; i++) {
			nums[i] = scanner.nextDouble();
		}
		Arrays.sort(nums);
		int res = 0;
		for (int i = 2; i >= 0; i--) {
			N = N - (int)Math.ceil(N*nums[i]/100);
		}
		
		System.out.println(temp - N);
//		
//		Class<?> clazz = nums.getClass();
//		System.out.println(clazz);
//		System.out.println(clazz.getName());

	}

}
