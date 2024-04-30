public class BuynSellStocks {

//   Q. Write a java program that you are given an array prices where prices[i] is the price of a given stock on the ith day.
//    You want to maximise your profit by choosing a single day to buy one stock and choosing a different day in the future to
//    sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return zero.
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int buyPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            int profit = prices[i] - buyPrice;
            maxProfit = Math.max(maxProfit, profit);
            buyPrice = Math.min(buyPrice, prices[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum profit: " +maxProfit(prices)); // Output: 5
    }
}
