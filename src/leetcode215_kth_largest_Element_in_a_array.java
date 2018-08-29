import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月11日 上午10:06:03
* 类说明: 
*/
public class leetcode215_kth_largest_Element_in_a_array {

	public static void main(String[] args) {
		int[] nums = {3,2,1,5,6,4};
//		System.out.println(findKthLargest3(nums, 2));
		PriorityQueue<Integer> minHeap = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		for (int item : nums) {
			minHeap.add(item);
		}
		System.out.println(minHeap.peek());
		
		
	}
	// 开个玩笑
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
		return nums[nums.length - k];
    }
    // 使用最大堆来解决，可以吗？
    public static int findKthLargest2(int[] nums, int k) {
    	int len = nums.length - 1;
    	// 模拟建堆
    	for (int i = len/2; i >= 0; i--) {
    		headAdjust(nums, i, len);
    	}
    	int lastIndex = len;
    	while (len > (lastIndex - k)) {
    		swap(nums, 0, len--);
    		headAdjust(nums, 0, len);
    	}
    	return nums[lastIndex - k + 1];
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
 	
 	// 优先队列 也可以解决
    public static int findKthLargest3(int[] nums, int k) {
    	PriorityQueue<Integer> largeK = new PriorityQueue<>();
    	for (int ele : nums) {
    		largeK.add(ele);
    	}
    	largeK.poll();
    	largeK.poll();
    	return largeK.poll();
    	
    }
 	
    

}
