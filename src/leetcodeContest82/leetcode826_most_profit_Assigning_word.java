package leetcodeContest82;

import java.util.List;

import 位运算.max;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月29日 上午10:18:32
* 类说明: 
*/
public class leetcode826_most_profit_Assigning_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] difficulty = {2,4,6,8,10};
		int[] profit = {10,20,30,40,50};
		int[] worker = {4,5,6,7};
		System.out.println(maxProfitAssignment(difficulty, profit, worker));
	}
	
	public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int[] a = new int[100000];
        for (int i = 0; i < difficulty.length; i++) {
        	int d = difficulty[i];
        	int p = profit[i];
        	a[d] = Math.max(a[d], p);
        }
        for (int i = 1; i < 100000; i++) {
        	a[i] = Math.max(a[i], a[i - 1]);
        }
        int sum = 0;
        for (int work : worker) {
        	sum += a[work];
        }
		return sum;
    }
}
