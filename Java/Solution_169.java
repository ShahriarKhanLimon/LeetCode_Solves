import java.util.HashMap;;
public class Solution_169 {
        public static int majorityElement(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int majorityCount = nums.length / 2;

            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            

                if (map.get(num) > majorityCount) {
                    return num;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        //Solution_169 solution = new Solution_169();
        
        // Example 1
        int[] nums1 = {3, 2, 3};
        // System.out.println("Majority Element: " + solution.majorityElement(nums1));  // Output: 3
        System.out.println("Majority Element: " + majorityElement(nums1));  // Output: 3
        // Example 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        // System.out.println("Majority Element: " + solution.majorityElement(nums2));  // Output: 2
        System.out.println("Majority Element: " + majorityElement(nums2));  // Output: 2


        // Example 3
        int[] nums3 = {1, 1, 1, 2, 2};
        // System.out.println("Majority Element: " + solution.majorityElement(nums3));  // Output: 1
        System.out.println("Majority Element: " + majorityElement(nums3));  // Output: 1
    }
}
