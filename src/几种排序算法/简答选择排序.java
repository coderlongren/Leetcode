package 几种排序算法;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月2日 上午10:26:13
* 类说明: 
*/
public class 简答选择排序 {

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
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length - 1; i++){
			int min = i;
			for (int j = i + 1; j < a.length; j++){
				if (a[j] < a[min]){
					min = j;
				}
			}
			// 已经得到了一个最小元素 
			// 再次优化 如果 min != i 在交换
			if (min != i){
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp; 
			}
		}
	}

}
