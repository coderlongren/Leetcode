package 几种排序算法;

import java.util.LinkedList;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月17日 下午3:32:09
* 类说明: 
*/
public class 快速排序 {
	public static void main(String[] args){
		int[] a = {4,2,1,3,5,-1,100};
		for (int i : a) {
			System.out.print(i  + " ");
		}
		sort(a, 0, a.length - 1);
		System.out.println();
		for (int i : a) {
			System.out.print(i  + " ");
		}
	}
	public static int partition(int []array,int lo,int hi){
        //固定的切分方式
        int key = array[lo];
        while(lo < hi){
            while(array[hi] >= key && hi > lo){ // 从后向前，找到第一个比key小的元素
                hi--;
            }
            array[lo] = array[hi]; // 交换 
            while(array[lo] <= key && hi > lo){// 从前往后，找到一个比key大的元素
                lo++;
            }
            array[hi] = array[lo]; // 交换
        }
        array[lo] = key;
        return lo; // lo之前的  和 之后的 已经有序了。
    }
    
    public static void sort(int[] array,int lo ,int hi){
        if(lo >= hi){
            return ;
        }
        int index=partition(array,lo,hi);
        sort(array,lo,index-1);
        sort(array,index+1,hi); 
    }
}
