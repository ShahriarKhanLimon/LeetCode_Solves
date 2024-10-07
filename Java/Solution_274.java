import java.util.Arrays;

public class Solution_274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int h = n - i;

            if (citations[i] >= h) {
                return h;
            }
        }
        
        return 0;
    }
    public static void main(String[] args) {
        Solution_274 sol = new Solution_274();
        // Example 1
        int[] citations1 = {3, 0, 6, 1, 5};
        System.out.println("H-Index: " + sol.hIndex(citations1));  // Output: 3

        // Example 2
        int[] citations2 = {1, 3, 1};
        System.out.println("H-Index: " + sol.hIndex(citations2));  // Output: 1
    }
}
