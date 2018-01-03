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
			int key = a[j];
			int i = j - 1;
			while (i >= 0 && a[i] > key){
				a[i + 1] = a[i];
				i--;
			}
			a[i + 1] = key;
		}
		
		
	}

}
