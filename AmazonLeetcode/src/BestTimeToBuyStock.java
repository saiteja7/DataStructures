
public class BestTimeToBuyStock {

	
	public static void main(String[] args) {
		int [] prices = {7,1,5,3,6,4};
	
		System.out.println(maxProfitSum(prices));
		System.out.println(maxProfit(prices));
	}
	
	   public static int maxProfitSum(int[] prices) {
	
		   int profit=0;
		   
		   for(int i=1;i<prices.length;i++) {
			   if(prices[i]>prices[i-1]) {
				   profit+=(prices[i]-prices[i-1]);
			   }
		   }
		return profit;
	        
	    }
   public static int maxProfit(int[] prices) {
		   
		   int maxProfit=0;
		   int minSoFar =prices[0];
		   for(int i=0;i<prices.length;i++) {
			minSoFar = Math.min(minSoFar, prices[i]);
			int profit = prices[i]-minSoFar;
			maxProfit = Math.max(profit, maxProfit);
		   }
		return maxProfit;
	        
	    }
}
