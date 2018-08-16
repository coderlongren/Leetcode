package 剑指offer;

import java.util.ArrayList;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月8日 下午11:02:45
* 类说明: 
*/
public class SumK {
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (sum <= 2) {
            return res;
        }
        int l = 1;
        int r = 2;
        while (l < r) {
            int currSum = sum(l, r);
            if (currSum == sum) {
                ArrayList<Integer> temp = new ArrayList<>();
                for (int i = l; i <= r; i++) {
                    temp.add(i);
                }
                res.add(temp);
                l++;
                r++;
            }
            else if (currSum > sum) {
                l++;
            }
            else {
                r++;
            }
        }
        return res;
    }
    public int sum(int l, int r) {
        return (l + r) * (r - l + 1)/2;
    }
}
