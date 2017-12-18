package leetcodeContest63;
/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月17日 上午10:39:04
* 类说明: 真的是简单DP吗，  为啥看不懂题目呢？ 英文太差了。
*/
public class leetcode746_min_cost_clmbing_stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cost = {10, 15, 20};
		System.out.println(minCostClimbingStairs(cost));
	}
	 public static int minCostClimbingStairs(int[] cost) {
		 int len = cost.length;
		 int[] DP = new int[len + 1];
		 for (int i = 2; i <= len; i++){
			 DP[i] = Math.min(DP[i - 1] + cost[i - 1], DP[i - 2] + cost[i - 2]);
		 }
		 return DP[len];
	 }

}
