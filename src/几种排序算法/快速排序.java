package ���������㷨;

import java.util.LinkedList;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��17�� ����3:32:09
* ��˵��:  
* 1. ��һ�� ����ʹ�� ��Ԫ�ؽӽ�����ʱ���˻�Ϊ �������� O(n)��ʱ�临�Ӷ�
* 2. �ڶ��У� ���ѡ���׼ֵ
* 3. ������ �Ż���������·�ϲ��ķ�ʽ ʹ�� left, i, j, right �ĸ�ָ��
*/
public class �������� {
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
	public static int partition(int[] array,int lo,int hi) {
        //�̶����зַ�ʽ
        int key = array[lo];
        while(lo < hi){
            while(array[hi] >= key && hi > lo){ // �Ӻ���ǰ���ҵ���һ����keyС��Ԫ��
                hi--;
            }
            array[lo] = array[hi]; // ���� 
            while(array[lo] <= key && hi > lo){// ��ǰ�����ҵ�һ����key���Ԫ��
                lo++;
            }
            array[hi] = array[lo]; // ����
        }
        array[lo] = key;
        return lo; // lo֮ǰ��  �� ֮��� �Ѿ������ˡ�
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
