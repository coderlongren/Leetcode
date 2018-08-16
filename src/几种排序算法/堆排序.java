package 几种排序算法;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月3日 上午10:41:58
* 类说明: 堆排序和 归并排序一样都是时间复杂度为 nlog(n)，同事又和插入排序一样都是 就地排序
*  不需要额外的空间
*/
public class 堆排序 {
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		int[] arr = {20,50,10,40,70,10,80,30,60};
		System.out.println("堆排序之前");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		heapSort2(arr);
		System.out.println("\n 堆排序之后");
		for (int i : arr) {
			System.out.print(i + " ");
		}
//		testPriority();
	}
	// 构造一个 逆序的堆排序
	public static void heapSort2(int[] arr) {
		int len = arr.length - 1;
		// 构造最小堆
		for (int i = len/2 - 1; i >= 0; i--) {
			heapAdjust2(arr, i, len);
		}
		while (len >= 0) {
			swap(arr, 0, len);
			len--;
			heapAdjust2(arr, 0, len);
		}
		
	}
	// 最小堆的 调整算法
	public static void heapAdjust2(int[] arr, int i, int len) {
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
			i = j;
		}
		
	}
	// 堆排序算法， 这里给出的是最大堆构造
	public static void heapSort(int[] arr) {
		int len = arr.length - 1;
		// 模拟堆的构造
		// i = len/2 - 1 i节点必须有孩子节点，才能调整
		for (int i = len/2 - 1; i >= 0; i--) {
			heapAdjust(arr, i, len);
		}
		
		while (len >= 0) {
			swap(arr, 0, len); // 堆顶元素，和尾节点交换之后，长度减一，最大元素已经到了堆的最后
			len--; // 堆长度减一
			heapAdjust(arr, 0, len); // 再次对堆进行调整 
		}
	}
	// 堆的调整算法， 堆排序的关键之处
	public static void heapAdjust(int[] arr, int i, int len) {
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
	
	public static void testPriority() {
		// 无所谓了 o1 - o2 其实就是默认的最小堆  堆顶是最小值。
		PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
			
		});
		queue.offer(2);
		queue.offer(1);
		queue.offer(5);
		queue.offer(4);
		queue.offer(3);
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
