public class Solution_55 {
    public static void main(String[] args) {
        Solution_55 solution = new Solution_55();

        // Test case 1: nums = [2, 3, 1, 1, 4] (Expected: true)
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println("Test case 1: " + solution.canJump(nums1));

        // Test case 2: nums = [3, 2, 1, 0, 4] (Expected: false)
        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println("Test case 2: " + solution.canJump(nums2));

        // Test case 3: nums = [0] (Expected: true - Already at the last index)
        int[] nums3 = {0};
        System.out.println("Test case 3: " + solution.canJump(nums3));

        // Test case 4: nums = [1, 0, 1, 0] (Expected: false - Can't move past index 1)
        int[] nums4 = {1, 0, 1, 0};
        System.out.println("Test case 4: " + solution.canJump(nums4));
    }

    public boolean canJump(int[] nums) {
        int farthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) {
                return false;
            }

            farthest = Math.max(farthest, i + nums[i]);

            if (farthest >= nums.length -1) {
                return true;
            }
        }
        return false;
    }
}
