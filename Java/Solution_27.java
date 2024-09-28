import java.util.Arrays;
class Solution_27{
    // public int removeElement(int[] nums, int val) {
        public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }


    public static void main(String[] args) {
        //Solution_27 solution = new Solution_27();

        int[] nums = {0,1,2,2,3,0,4,2}; // Input array
        int val = 2; // Value to remove
        int[] expectedNums = {0, 1, 3, 0, 4}; // The expected answer with correct length.
                                    // It is sorted with no values equaling val.

        //int k = solution.removeElement(nums, val); // Calls your implementation

        int k = removeElement(nums, val); // Calls your implementation

        assert k == expectedNums.length;
        Arrays.sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
        System.out.println("All assertions passed. The result is valid.");
    }
}