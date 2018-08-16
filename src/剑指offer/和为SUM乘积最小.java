package ��ָoffer;

import java.util.ArrayList;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��8��8�� ����11:09:17
* ��˵��: 
*/
public class ��ΪSUM�˻���С {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int l = 0;
        int r = array.length - 1;
        ArrayList<Integer> res = new ArrayList<>();
        while (l < r) {
            int temp = array[l] + array[r];
            if (temp == sum) {
                res.add(array[l]);
                res.add(array[r]);
                break;
            }
            else if (temp < sum) {
                l++;
            }
            else {
                r--;
            }
        }
        return res;
    }
}
