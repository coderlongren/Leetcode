package 几种排序算法;
/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月17日 下午2:52:10
* 类说明:  就地排序 不需要额外的空间
*/
public class 插入排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,2,1,3,5};
		for (int i : a) {
			System.out.print(i  + " ");
		}
		InsertSort(a);
		System.out.println();
		for (int i : a) {
			System.out.print(i  + " ");
		}
	}
	public static void InsertSort(int[] a){
		for (int j = 1;j < a.length; j++){
			// 从待插入数组中取出第一个元素
			int key = a[j];
			// i - 1 为有序数组最后一个元素，
			int i = j - 1;
			
			// 第一个条件为边界限制，第二个为插入判断条件
			while (i >= 0 && a[i] > key){
				a[i + 1] = a[i];// 若不是合适位置，有序数组向后移动
				i--;
			}
			
			a[i + 1] = key; // 找到合适位置，将元素插入
		}
	}

}
