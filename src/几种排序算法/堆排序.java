package 几种排序算法;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月3日 上午10:41:58
* 类说明: 堆排序和 归并排序一样都是时间复杂度为 nlog(n)，同事又和插入排序一样都是 就地排序
*  不需要额外的空间
*/
public class 堆排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {20,50,10,40,70,10,80,30,60};
		System.out.println("堆排序之前");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		heapSort(arr);
		System.out.println("\n 堆排序之后");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
	}
	// 堆排序算法， 最大堆
	public static void heapSort(int[] arr) {
		int len = arr.length - 1;
		// 模拟堆的构造
		for (int i = len/2 - 1; i >= 0; i--) {
			headAdjust(arr, i, len);
		}
		
		while (len >= 0) {
			swap(arr, 0, len); // 堆顶元素，和尾节点交换之后，长度减一，最大元素已经到了堆的最后
			len--; // 堆长度减一
			headAdjust(arr, 0, len); // 再次对堆进行调整 
		}
	}
	
	// 堆的调整算法， 堆排序的关键之处
	public static void headAdjust(int[] arr, int i, int len) {
		// i 为非叶子节点的索引
		int left;
		int right;
		int j;
		while ((left = 2*i + 1) <= len) { // 判断当前节点有无 左节点，left为左节点
			right = left + 1; // 右节点
			j = left; // j ---> left
			if (j < len) { // 上面假设的右节点存在的话
				if (arr[left] < arr[right]) {
					j++; // j---> right 指向右节点
				}
			}
			if (arr[i] < arr[j]) {
				swap(arr, i, j);
			}
			else {
				break; // 父节点，比左右孩子节点都大，不需要比较了
			}
			
			// 这个 i = j， 会循环调整堆
			i = j;
		}
	}
	
	// 交换，堆中两个节点的值, 其实就是每次调整完之后，把堆顶的最大元素放到尾部，就好比进行了一次冒泡
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
