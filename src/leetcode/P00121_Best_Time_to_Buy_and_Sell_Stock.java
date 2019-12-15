package leetcode;

public class P00121_Best_Time_to_Buy_and_Sell_Stock {
	
	public static void main(String[] args) {
		int[] input = {7,1,5,3,6,4};
		int max_profit = maxProfit(input);
		System.out.println(max_profit);
	}
	
	 public static int maxProfit(int[] prices) {
	   
		 if(prices == null || prices.length == 0) {
			 return 0;
		 }
		 
		 int result = 0;
		 int min = prices[0];
		 for(int i = 1 ; i < prices.length ; i++) {
			 result = Math.max(result, prices[i] - min);
			 min = Math.min(min, prices[i]);
		 }
		return result; 
	 }

}
