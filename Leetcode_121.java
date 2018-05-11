package Leetcode;

public class Leetcode_121 {
	public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        
        int maxVal = 0;
        int minVal = prices[0];
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] > minVal){
                maxVal = Math.max(maxVal, prices[i] - minVal);
            }else{
                minVal = prices[i];
            }
        }
        return maxVal;
    }
}
