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
        int key=array[lo];
        while(lo<hi){
            while(array[hi]>=key&&hi>lo){
                hi--;
            }
            array[lo]=array[hi];
            while(array[lo]<=key&&hi>lo){
                lo++;
            }
            array[hi]=array[lo];
        }
        array[lo]=key;
        return lo;
    }
    
    public static void sort(int[] array,int lo ,int hi){
        if(lo>=hi){
            return ;
        }
        int index=partition(array,lo,hi);
        sort(array,lo,index-1);
        sort(array,index+1,hi); 
    }
}
