package 分治;

import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月26日 下午11:02:56
* 类说明:  这是一道 链家网的校招笔试题， 当时自己以为要用算法设计与分析里面的分治法来做， 
*  回来之后，才想到， 用两个字符串就可以实现了。以前想做过一次，可惜忘记了
*   没有必要考虑，时间复杂度，考察点不在于此啊！！！
*/
public class 大数想乘 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		int[] res = new int[s1.length() + s2.length()]; // 他们长度之后，是足够保存的
		for (int i = 0; i < s1.length(); i++) {
			int n1 = s1.charAt(s1.length() - 1 - i) - '0'; // s1最低位的 数字
			int arr = 0;
			for (int j = 0; j < s2.length(); j++) {
				int n2 = s2.charAt(s2.length() - 1 - j) - '0'; // s2的最低位的数字
				arr = arr + res[i + j] + n1*n2;
				res[i + j] = arr%10;// 保存余数
				arr /= 10; // 保存进位
			}
			// 如果 还有进位
			if (arr != 0) {
				res[s2.length() + i] = arr;
			}
		}
		StringBuilder stringBuilder = new StringBuilder();
		boolean flag = true;
		for (int i = res.length - 1; i >= 0; i--) {
			if (res[i] == 0 && flag) {
				continue;
			}
			flag = false;
			stringBuilder.append(res[i]);
			
		}
		System.out.println(stringBuilder.toString());
	}

}
