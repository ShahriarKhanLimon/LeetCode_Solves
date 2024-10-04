public class Solution_122 {
    public static void main(String[] args) {
        Solution_122 sol = new Solution_122();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(sol.maxProfit(prices));  // Output: 5
        
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(sol.maxProfit(prices2));  // Output: 0
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
}