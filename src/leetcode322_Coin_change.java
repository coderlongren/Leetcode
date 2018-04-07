import java.util.Arrays;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��6�� ����10:26:10
* ��˵��: 
*/
public class leetcode322_Coin_change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {2};
		System.out.println(coinChange(coins, 3));
	}
	// ��һ������ һ�㻯Ӳ�����������˵��this is so easy!
	public static int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0 || amount <= 0) {
        	return 0;
        }
        if (coins.length == 1) {
        	
        }
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, 100000);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
        	for (int j = 0; j < coins.length; j++) {
        		if (i >= coins[j]) {
        			dp[i] = Math.min(dp[i], dp[i - coins[j]]+ 1);
        		}
        	}
        }
        return dp[amount] == 100000?-1:dp[amount];
    }
}
