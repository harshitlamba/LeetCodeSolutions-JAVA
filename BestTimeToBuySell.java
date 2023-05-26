public class BestTimeToBuySell {
    public static int maxProfit(int[] prices) {
        int buyIdx = 0;
        int sellIdx = 1;
        int max = 0;
        while (sellIdx < prices.length) {
            if (prices[buyIdx] > prices[sellIdx]) {
                buyIdx++;
            } else {
                max = Math.max(max, prices[sellIdx] - prices[buyIdx]);
                sellIdx++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices1 =  new int[]{7,1,5,3,6,4};
        int[] prices2 =  new int[]{7,6,5,4};
        int[] prices3 =  new int[]{1,2};

        System.out.println("Max Profit for Prices1 is: " + maxProfit(prices1));
        System.out.println("Max Profit for Prices2 is: " + maxProfit(prices2));
        System.out.println("Max Profit for Prices3 is: " + maxProfit(prices3));
    }
}
