
public class leetcode121_BestTimeToBuyAndSellStock {
/**
 * ��õ� ��Ʊ �������� ѡ�� 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int maxProfit(int[] prices) {
	     if (prices == null || prices.length == 0){
	    	 return 0;
	     }
	     //������������� 
	     int profit = 0;
	     int min = prices[0];
	     for (int i = 0; i < prices.length; i++){
	    	 //�ҵ��� ���͵������
	    	 if (min >= prices[i]){
	    		 min = prices[i];
	    	 }
	    	 else{
	    		 //�ҵ��� ���ߵ� ����
	    		 if (prices[i] - min > profit){
	    			 profit = prices[i] - min;
	    		 }
	    	 }
	     }
	     return profit;
	     
	 }
}
