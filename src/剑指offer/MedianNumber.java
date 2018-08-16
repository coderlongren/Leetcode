package ��ָoffer;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��8��13�� ����1:18:20
* ��˵��:  ��������λ�� �㷨
*/
public class MedianNumber {
	PriorityQueue<Integer> maxHeap; // ����
	PriorityQueue<Integer> minHeap; // ��С��
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
			minHeap.offer(num); // �����Ѵ�С��һ���ģ����ݼ�����һ������������ġ�
		}
    }

	// ���ȡһ����λ��
    public Integer GetMedian() {
    	if (minHeap.size() > maxHeap.size()) {
    		return minHeap.peek();
    	}
    	else if (minHeap.size() < maxHeap.size()) {
    		return maxHeap.peek();
    	}
    	else if (minHeap.isEmpty() && maxHeap.isEmpty()) {
    		return 0; // �����Ѷ�û�м���Ԫ�أ��϶���0��
    	}
    	else { // �����Ѵ�Сһ�µ�ʱ�򣬾ͷ��� �����Ѷ�Ԫ�ص�ƽ��ֵ��
    		return (minHeap.peek() + maxHeap.peek()) / 2;
    	}
    }
}
