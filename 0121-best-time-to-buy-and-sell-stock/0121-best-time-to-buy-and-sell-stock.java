class Solution {
    public int maxProfit(int[] prices) {
     int n = prices.length;
		if (n == 0 || n == 1) {
			return 0;
		}
		int buy = Integer.MAX_VALUE;
		int result = 0;
		int pist =0;
		for(int i = 0; i < prices.length; i++){
            if(prices[i] < buy){
            	buy = prices[i];
            }
            pist = prices[i] - buy;
            if(result < pist){
            	result = pist;
            }
        }
        return result;
    }
}