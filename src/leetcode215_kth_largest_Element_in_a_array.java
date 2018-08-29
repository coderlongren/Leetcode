import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��11�� ����10:06:03
* ��˵��: 
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
	// ������Ц
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
		return nums[nums.length - k];
    }
    // ʹ�������������������
    public static int findKthLargest2(int[] nums, int k) {
    	int len = nums.length - 1;
    	// ģ�⽨��
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
    
    
 // �������㷨�� ����
 	public static void heapSort(int[] arr) {
 		int len = arr.length - 1;
 		// ģ��ѵĹ���
 		for (int i = len/2 - 1; i >= 0; i--) {
 			headAdjust(arr, i, len);
 		}
 		
 		while (len >= 0) {
 			swap(arr, 0, len); // �Ѷ�Ԫ�أ���β�ڵ㽻��֮�󣬳��ȼ�һ�����Ԫ���Ѿ����˶ѵ����
 			len--; // �ѳ��ȼ�һ
 			headAdjust(arr, 0, len); // �ٴζԶѽ��е��� 
 		}
 	}
 	
 	// �ѵĵ����㷨�� ������Ĺؼ�֮��
 	public static void headAdjust(int[] arr, int i, int len) {
 		// i Ϊ��Ҷ�ӽڵ������
 		int left;
 		int right;
 		int j;
 		while ((left = 2*i + 1) <= len) { // �жϵ�ǰ�ڵ����� ��ڵ㣬leftΪ��ڵ�
 			right = left + 1; // �ҽڵ�
 			j = left; // j ---> left
 			if (j < len) { // ���������ҽڵ���ڵĻ�
 				if (arr[left] < arr[right]) {
 					j++; // j---> right ָ���ҽڵ�
 				}
 			}
 			if (arr[i] < arr[j]) {
 				swap(arr, i, j);
 			}
 			else {
 				break; // ���ڵ㣬�����Һ��ӽڵ㶼�󣬲���Ҫ�Ƚ���
 			}
 			
 			// ��� i = j�� ��ѭ��������
 			i = j;
 		}
 	}
 	
 	// ���������������ڵ��ֵ, ��ʵ����ÿ�ε�����֮�󣬰ѶѶ������Ԫ�طŵ�β�����ͺñȽ�����һ��ð��
 	public static void swap(int[] arr, int i, int j) {
 		int temp = arr[i];
 		arr[i] = arr[j];
 		arr[j] = temp;
 	}
 	
 	// ���ȶ��� Ҳ���Խ��
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
