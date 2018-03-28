package 今日头条;

import java.util.Scanner;
import java.util.prefs.BackingStoreException;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月25日 上午11:17:14
* 类说明: 
*/
public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		if (array.length == 1) {
			System.out.println(array[0]);
		}
		else if (array.length == 2) {
			System.out.println(array[0] + "," + array[1]);
		}
		else {
			StringBuilder stringBuilder = new StringBuilder();
			for (int i =0; i < array.length; i++) {
				StringBuilder temp = new StringBuilder();
				int start = array[i];
				temp.append(start + "");
				if ((start + 1) < array.length && array[start + 1] - array[start] > 1) {
					stringBuilder.append(array[start] + ",");
				}
				else {
					int temprr = Backing(temp, array, start + 1);
					if (temprr >= 3) {
						String ssss = array[start] + "-" + array[start + temprr - 1] + ",";
						stringBuilder.append(ssss);
					}
					else {
						stringBuilder.append(array[start] + ",");
					}
				}
					
			}
			System.out.println(stringBuilder.toString());
		}
	}
	public static int Backing(StringBuilder stringBuilder, int[] array, int start) {
		stringBuilder.append(array[start] + "");
		if ((start + 1) < array.length && array[start + 1] - array[start] > 1) {
			return stringBuilder.length();
		}
		return Backing(stringBuilder, array, start + 1);
	}

}
