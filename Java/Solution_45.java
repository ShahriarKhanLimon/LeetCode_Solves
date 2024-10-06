public class Solution_45 {
    public static void main(String[] args) {
        Solution_45 solution = new Solution_45();

        // Test case 1: nums = [2, 3, 1, 1, 4] (Expected: 2)
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println("Test case 1: " + solution.Jump(nums1));

        // Test case 2: nums = [3, 2, 1, 0, 4] (Expected: 0)
        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println("Test case 2: " + solution.Jump(nums2));

        // Test case 3: nums = [0] (Expected: 1)
        int[] nums3 = {0};
        System.out.println("Test case 3: " + solution.Jump(nums3));

        // Test case 4: nums = [1, 0, 1, 0] (Expected: 2)
        int[] nums4 = {2, 3, 0, 1, 4};
        System.out.println("Test case 4: " + solution.Jump(nums4));
    }

    public int Jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}
