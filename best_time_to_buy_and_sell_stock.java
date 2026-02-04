//brute force

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
}


//better

class Solution {
    public int maxProfit(int[] prices) {

        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        for ( int i = 0; i < prices.length; i ++) {

            if (prices[i] < minValue) {
                minValue = prices[i];
            }
             else if (prices[i] - minValue > maxProfit){
                maxProfit = prices[i] - minValue;
             }
        }
        return maxProfit;
    }
}

//optimal


class Solution {

    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }
}