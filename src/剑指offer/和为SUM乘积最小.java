package 剑指offer;

import java.util.ArrayList;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月8日 下午11:09:17
* 类说明: 
*/
public class 和为SUM乘积最小 {
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
