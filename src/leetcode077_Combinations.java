import java.util.ArrayList;
import java.util.List;

public class leetcode077_Combinations {

	public static void main(String[] args) {
		System.out.println(combine(4,2));
		
	}
	// 排列组合问题  使用回溯法
	// Backtracking Solution Java
	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> test = new ArrayList<Integer>();
		combine1(res,test,1,n,k);
		return res;
    }
	public static void combine1(List<List<Integer>> res,List<Integer> temp,int start,int n,int k){
		if (k == 0){
			res.add(new ArrayList<Integer>(temp));
			return ;
		}
		
		for (int i = start;i <= n; i++){
			temp.add(i);
			combine1(res,temp, i + 1,n,k - 1);
			temp.remove(temp.size() - 1);
		}
	}

}
