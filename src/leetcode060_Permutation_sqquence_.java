import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月4日 下午6:48:29
* 类说明:  TLE  9 1024 
*/
public class leetcode060_Permutation_sqquence_ {
	public static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
//		System.out.println(list.toString());
		System.out.println(getPermutation(3, 2));
	}
	public static String getPermutation(int n, int k) {
		StringBuilder res = new StringBuilder();
		backtrack(new ArrayList<>(), n, k, res);
		return res.toString();
    }
	public static void backtrack(List<Integer> temp, int n, int k, StringBuilder res) {
		if (temp.size() == n) {
			count++;
			if (count == k) {
				for (int num : temp) {
					res.append(num + "");
				}
				return;
			}
		}
		else {
			for (int i = 1; i <= n; i++) {
				if (temp.contains(i)) {
					continue;
				}
				temp.add(i);
				backtrack(temp, n, k, res);
				temp.remove(temp.size() - 1);
			}
		}
		
	}

}
