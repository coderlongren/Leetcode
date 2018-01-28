package leetcodeContest69;

import java.util.Arrays;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月28日 上午11:22:30
* 类说明: 
*/
public class leetcode775_global_and_local_inversions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean isIdealPermutation(int[] A) {
		for (int i = 0; i < A.length; i++) {
			// i元素 不在原来的位置
			if (A[i] != i) {
				if (A[i + 1] == i && A[i] == i + 1) {
					i++;
				}
				else {
					return false;
				}
			}
		}
		return true;
    }

}
