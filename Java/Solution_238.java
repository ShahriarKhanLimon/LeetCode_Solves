import java.util.Arrays;

public class Solution_238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return answer; 
    }    
    public static void main(String[] args) {
        Solution_238 sol = new Solution_238();

        // Test Case 1
        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = sol.productExceptSelf(nums1);
        System.out.println(Arrays.toString(result1)); // Output: [24, 12, 8, 6]

        // Test Case 2
        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] result2 = sol.productExceptSelf(nums2);
        System.out.println(Arrays.toString(result2)); // Output: [0, 0, 9, 0, 0]
    }
}
