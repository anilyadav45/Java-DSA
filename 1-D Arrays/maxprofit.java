public class maxprofit {
    public static int buyandsellstocks(int prices[]) {
        int buying_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
            int selling_price = prices[i];
            if (selling_price > buying_price) {
                int profit = selling_price - buying_price; // This is for today's prof
                // For max Profit
                max_profit = Math.max(max_profit, profit);
            } else {
                buying_price = selling_price;
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyandsellstocks(prices));
    }
}