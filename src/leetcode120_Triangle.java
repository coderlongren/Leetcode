import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月31日 下午4:15:53
* 类说明:  现在来写这道题就 so easy!!!
*/
public class leetcode120_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		res.add(list1);
		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(4);
		res.add(list2);
		List<Integer> list3 = new ArrayList<>();
		list3.add(6);
		list3.add(5);
		list3.add(7);
		res.add(list3);
		System.out.println(minimumTotal(res));
		
	}
	public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null) {
        	return 0;
        }
        int row = triangle.size();
        int[][] dp = new int[row][row];
        for (int i = 0; i < row; i++) {
        	dp[row - 1][i] = triangle.get(triangle.size() - 1).get(i);
        }
        for (int i = row - 2; i >= 0; i--) {
        	for (int j = 0; j <= i; j++) {
        		dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
        		
        	}
        }
		return dp[0][0];
    }

}
