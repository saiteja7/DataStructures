
public class BuyAndSellStock {
	
	public static void main(String[] args) {
		int [] a = {7,6,4,3,1,2};
		checkMAxProfit(a);
	}
	
	public static int checkMAxProfit(int[] a)
	{int maxProfit = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[j]>a[i]) {
					int profit = a[j]-a[i];
					if(profit>maxProfit) {
						maxProfit = profit;
					}
				}
			}
		}
		System.out.println(maxProfit);
		return maxProfit;
		
	}
}
