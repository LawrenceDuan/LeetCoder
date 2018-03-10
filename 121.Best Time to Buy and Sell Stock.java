/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example 1:
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
Example 2:
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.
*/

//Accepted
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = 0;
        int result = 0;
        
        if(prices.length < 1){
            return 0;
        }else if(prices.length >= 1){
            minPrice = prices[0];
        }

        for(int i = 0;i < prices.length;i++){
            if(prices[i] <= minPrice){
                minPrice = prices[i];
            }
            if(prices[i] - minPrice > result) result = prices[i] - minPrice;
        }
        
        return result;
    }
}


//Solution
/*
We need to find out the maximum difference (which will be the maximum profit) between two numbers in the given array. Also, the second number (selling price) must be larger than the first one (buying price).

In formal terms, we need to find max(prices[j]−prices[i]), for every i and j such that j>i.
*/
//------------------------------------------------------------------------------------------------------
//Approach #1 (Brute Force) [Time Limit Exceeded]
public class Solution {
    public int maxProfit(int prices[]) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;
    }
}
/*
Complexity Analysis
Time complexity : O(n2). Loop runs ​n(n−1)/2 times.
Space complexity : O(1). Only two variables - maxprofit and profit are used.
*/

//------------------------------------------------------------------------------------------------------
//Approach #2 (One Pass) [Accepted]
/*
Algorithm
Say the given array is:
[7, 1, 5, 3, 6, 4]

The points of interest are the peaks and valleys in the given graph. We need to find the largest peak following the smallest valley. We can maintain two variables - minprice and maxprofit corresponding to the smallest valley and maximum profit (maximum difference between selling price and minprice) obtained so far respectively.
*/
public class Solution {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
/*
Complexity Analysis
Time complexity : O(n). Only a single pass is needed.
Space complexity : O(1). Only two variables are used.
*/
