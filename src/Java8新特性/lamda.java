package Java8新特性;

import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月21日 下午8:44:56
* 类说明: 
*/
public class lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,4,2};
		int k = 5;
		countSort(A, k);
		for (int i : A) {
			System.out.print(i + " ");
		}
		
		
	}
	public static void countSort(int[] A , int k){
        //初始化count数组
        int[] count = new int[k];
        //为输入数组中每个元素计数
        for(int i : A)
            count[i]++;
        //计算各个数之前元素的总和
        for(int i = 1; i < k; i++) 
            count[i] = count[i] + count[i-1];
        //初始化一个新的数组存放排序后的元素
        int[] B = new int[A.length];
        for(int j = A.length-1; j >= 0; j--){
            //把A[j]放到对应的位置
            B[count[A[j]]-1] = A[j];
            //计数器减一
            count[A[j]]--;
        }
        System.arraycopy(B,0, A, 0,A.length);
    }

}
