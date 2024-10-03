public class Solution_121 {
    public static void main(String[] args) {
        Solution_121 sol = new Solution_121();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(sol.maxProfit(prices));  // Output: 5
        
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(sol.maxProfit(prices2));  // Output: 0
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int potentialProfit = prices[i] - minPrice;

            if (potentialProfit > maxProfit) {
                maxProfit = potentialProfit;
            }
        }

        return maxProfit;
    }
}
