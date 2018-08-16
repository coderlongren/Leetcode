package 剑指offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月6日 下午11:24:28
* 类说明: 
*/
public class LeastNumbers {
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
	       ArrayList<Integer> result = new ArrayList<Integer>();
	       int length = input.length;
	       if(k > length || k == 0){
	           return result;
	       }
	        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return o2 - o1;
				}
			});
	        for (int i = 0; i < length; i++) {
	            if (maxHeap.size() != k) {
	                maxHeap.offer(input[i]);
	            } else if (maxHeap.peek() > input[i]) {
	                Integer temp = maxHeap.poll();
	                temp = null;
	                maxHeap.offer(input[i]);
	            }
	        }
	        for (Integer integer : maxHeap) {
	            result.add(integer);
	        }
	        return result;
	    }
}
