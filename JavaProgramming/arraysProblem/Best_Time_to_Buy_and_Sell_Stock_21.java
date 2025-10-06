package arraysProblem;

public class Best_Time_to_Buy_and_Sell_Stock_21 {


	public static int maxProfit(int [] prices) {

		// Start with the highest possible value so first price will replace it
		int minPrice = Integer.MAX_VALUE;
		
		// Start with zero profit
		int maxProfit = 0;

		for(int p : prices) {

			// Case 1: Found a new cheaper price → better day to buy
			if(p<minPrice) {
				minPrice = p;
			}

			// Case 2: Price is higher than minPrice → check selling profit
			else {
				int profit = p-minPrice;

				if(profit>maxProfit) {
					maxProfit = profit;
				}
			}
		}

		return maxProfit;

	}


	public static void main(String[] args) {
		System.out.println(maxProfit(new int [] {1,2,3}));
	}
}
