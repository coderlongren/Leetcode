package 剑指offer;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月13日 下午1:18:20
* 类说明:  数据流中位数 算法
*/
public class MedianNumber {
	PriorityQueue<Integer> maxHeap; // 最大堆
	PriorityQueue<Integer> minHeap; // 最小堆
	public MedianNumber(){
		maxHeap = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		minHeap = new PriorityQueue<>(); 
	}
	public void Insert(Integer num) {
		if (maxHeap.size() == 0 || num < maxHeap.peek()) {
			if (maxHeap.size() > minHeap.size()) {
				minHeap.offer(maxHeap.poll());
			}
			maxHeap.offer(num);
		}
		else if (minHeap.size() == 0 || num > minHeap.peek()) {
			if (minHeap.size() > maxHeap.size()) {
				maxHeap.offer(minHeap.poll());
			}
			minHeap.offer(num);
		}
		else {
			minHeap.offer(num); // 两个堆大小是一样的，数据加入哪一个堆中是任意的。
		}
    }

	// 如何取一个中位数
    public Integer GetMedian() {
    	if (minHeap.size() > maxHeap.size()) {
    		return minHeap.peek();
    	}
    	else if (minHeap.size() < maxHeap.size()) {
    		return maxHeap.peek();
    	}
    	else if (minHeap.isEmpty() && maxHeap.isEmpty()) {
    		return 0; // 两个堆都没有加入元素，肯定是0的
    	}
    	else { // 两个堆大小一致的时候，就返回 两个堆顶元素的平均值。
    		return (minHeap.peek() + maxHeap.peek()) / 2;
    	}
    }
}
