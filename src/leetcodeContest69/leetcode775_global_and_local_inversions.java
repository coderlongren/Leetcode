package leetcodeContest69;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月28日 上午11:10:23
* 类说明:  is just a joke 计算全局染色体数目O(n^2) 明显不会通过的 so.......
*/
public class leetcode775_global_and_local_inversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,0};
		System.out.println(isIdealPermutation(A));
	}
	public static boolean isIdealPermutation(int[] A) {
        int local_num = 0;
        int global_num = 0;
        if (A.length == 1) {
        	return true;
        }
        for (int i = 0; i < A.length - 1; i++) {
        	if (A[i] > A[i + 1]) {
        		local_num++;
        	}
        }
        for (int i = 0; i < A.length - 1; i++) {
        	for (int j = i + 1; j < A.length; j++) {
        		if (A[i] > A[j]) {
        			global_num++;
        		}
        	}
        }
        return global_num == local_num;
        
    }

}
