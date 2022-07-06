package leetCode;

public class Best_Time_to_Buy_and_Sell_Stock {

	/*
	 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
	 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the 
	 * future to sell that stock.
	 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
	 */
	
	public static void main(String[] args) {
		
		//int[] prices = {7,1,5,3,6,4};
		int[] prices =  {983,341,957,541,470,660,118,742,334,822,165,145,730,656,567,25,684,113,351,295,468,918,587,4,399,220,11,222,777,127,135,688,267,570,342,748,382,428,340,35,896,846,376,655,147,891,198,420,729,685,989,543,285,822,254,878,380,758,490,73,870,328,234,489,990,387,688,12,795,746,275,371,321,298,186,925,845,816,775,647,379,15,602,756,619,256,106,312,965,661,973,147,437,796,56,955,846,245,502,889,557,281,936,812,880,880,834,186,303,96,706,634,464,232,170,188,527,637,847,293,726,146,441,973,380,61,956,599,626,206,284,815,36,591,166,690,454,700,458,808,410,252,365,953,650,609,438,106,582,82,925,847,800,128,615,440,956,142,488,350,474,762,435,37};

		
	
		System.out.println(maxProfit(prices));
		System.out.println(maxProfit2(prices));

	}
	
	
	public static int maxProfit(int[] prices) {
		int result = 0;
		for(int i=0;i<prices.length;i++) {
			for(int j=i+1;j<prices.length;j++) {
				int temp = prices[j]-prices[i];
				if(temp>result) {
					result = temp;
				}
			}
		}
		return result;
	}
	
	public static int maxProfit2(int[] prices) {
		int result = 0;
		int sofarMin = prices[0] ; //1
		
		for(int i=0; i<prices.length;i++) {
			if(prices[i]>sofarMin) {
				result = Math.max(result, prices[i]-sofarMin);
			} else {
				sofarMin = prices[i]; //1,
			}
		}
		
		return result;
	}

}
