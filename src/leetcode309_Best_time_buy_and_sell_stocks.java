import java.nio.channels.Pipe;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月5日 下午4:44:16
* 类说明: 
*/
public class leetcode309_Best_time_buy_and_sell_stocks {
	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 0, 2};
		System.out.println(maxProfit2(prices));
	}
	// 一道 很困难的DP问题。
	// 参考了网上大神的做法， 
	// 
	public static int maxProfit(int[] prices) {
       if (prices == null || prices.length == 0) {
    	   return 0;
       }  
       int sell = 0, prev_sell = 0, buy = Integer.MIN_VALUE, prev_buy;
       for (int price : prices) {
           prev_buy = buy;
           buy = Math.max(prev_sell - price, prev_buy);
           prev_sell = sell;
           sell = Math.max(prev_buy + price, prev_sell);
       }
       return sell;
    }
	public static int maxProfit2(int[] prices) {
		if (prices == null || prices.length < 2) {
	    	   return 0;
	    } 
		int[] sell = new int[prices.length];
		int[] buy = new int[prices.length];
		sell[0] = 0;
		buy[0] = -prices[0];// 第一天买入，收益是负的
		
		for (int i = 1; i < prices.length; i++) {
			if (i == 1) {
				sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
				buy[i] = Math.max(buy[i - 1], 0 - prices[i]);
			}
			else {
				sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
				buy[i] = Math.max(buy[i - 1], sell[i - 2] - prices[i]);
			}
		}
		return sell[prices.length - 1];
	}
}
