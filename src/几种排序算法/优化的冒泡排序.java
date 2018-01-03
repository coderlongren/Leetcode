package 几种排序算法;

import java.util.TreeSet;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月2日 上午10:33:25
* 类说明: 
*/
public class 优化的冒泡排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,2,1,3,5,-1,100};
		for (int i : a) {
			System.out.print(i  + " ");
		}
		sort(a);
		System.out.println();
		for (int i : a) {
			System.out.print(i  + " ");
		}
	}

	private static void sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++){
			boolean flag = false; // 如果flag = true 则证明是一次也没有交换，已经排好序了 直接break
			for (int j = 0; j < a.length - 1 - i; j++){
				if (a[j] > a[j + 1]){
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = true;
				}
			}
			if (!flag){
				break;
			}
		}
	}

}
