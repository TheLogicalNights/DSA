package bestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStock {
    public int identifyProfit(int[] prices) {
        int currentPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            int difference = prices[i] - currentPrice;

            if (difference > profit) {
                profit = difference;
            }

            if (prices[i] < currentPrice) {
                currentPrice = prices[i];
            }
        }

        return profit;
    }
}
