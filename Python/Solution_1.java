import java.util.Arrays;
import java.util.HashMap;

public class Solution_1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }

            numMap.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args){
        Solution_1 sol = new Solution_1();

        int[] nums1 = {2,7,11,15};
        int target1 = 9; 
        int[] result1 = sol.twoSum(nums1, target1);
        System.out.println(Arrays.toString(result1)); // Output: [0,1]
        
        int[] nums2 = {3,2,4};
        int target2 = 6; 
        int[] result2 = sol.twoSum(nums2, target2);
        System.out.println(Arrays.toString(result2)); // Output: [1,2]

        int[] nums3 = {3,3};
        int target3 = 6; 
        int[] result3 = sol.twoSum(nums3, target3);
        System.out.println(Arrays.toString(result3)); // Output: [0,1]
    }
}
