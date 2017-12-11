
public class leetcode121_BestTimeToBuyAndSellStock {
/**
 * 最好的 股票 买入卖出 选择 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int maxProfit(int[] prices) {
	     if (prices == null || prices.length == 0){
	    	 return 0;
	     }
	     //定义最初的利润 
	     int profit = 0;
	     int min = prices[0];
	     for (int i = 0; i < prices.length; i++){
	    	 //找到了 更低的买入价
	    	 if (min >= prices[i]){
	    		 min = prices[i];
	    	 }
	    	 else{
	    		 //找到了 更高的 利润
	    		 if (prices[i] - min > profit){
	    			 profit = prices[i] - min;
	    		 }
	    	 }
	     }
	     return profit;
	     
	 }
}
