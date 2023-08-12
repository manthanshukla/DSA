/*You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock 
and choosing a different day 
in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. 
If you cannot achieve any profit, return 0.
leetcode */
class Solution {
    public int maxProfit(int[] prices) {
        int finalPrice = 0; 
        int buy = prices[0]; 
        
        for (int i = 1; i < prices.length; i++) { 
            int sell = prices[i]; 
            int temp = sell - buy;             
            if (temp > finalPrice) {
                finalPrice = temp; 
            }
            
            if (sell < buy) {
                buy = sell; 
            }
        } 
        
        return finalPrice;
    }
}