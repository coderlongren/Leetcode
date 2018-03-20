package leetcodeContest76;

import java.util.Arrays;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月18日 下午12:49:46
* 类说明: 
*/
public class twoArray {
	public static void process(int[] a, int [] b, int n) {
		int[] temp = new int[2*n];
		int i;
		// 把两个数组复制到一个数组中去
		for (int index = 0; index < n; index++) {
			temp[index] = a[index];
			temp[index + n] = b[index];
		}
		 // 从小到大 排序
		Arrays.sort(temp);
		// 将排序后的数组，按从大到小顺序放入a，b数组中，规则是先放a，再放b，
		//直到b中的元素总和大于等于a后，再放a中，以此类推
		int curA = 0; 
		int curB = 0;
		int sumA = 0; 
		int sumB = 0;
		// 最大元素 先放入a中
		a[curA++] = sumA = temp[2*n - 1];
		
		for (i = 2*n - 2; i >= 0; i--) {
			// 第二大的放进b里面
			if (sumA > sumB && curB < n) {
				b[curB] = temp[i];
				sumB += b[curB++];
			}
			else if (curA < n) {
				a[curA] = temp[i];
				sumA += a[curA++];
			}
		}
			
		
	}
	public static void main(String[] args) {
		int[] a = {1,3,5,7,8};
		int[] b = {2,3,5,4,10};
		process(a, b, a.length);
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : b) {
			System.out.print(i + " ");
		}
	}
}	
