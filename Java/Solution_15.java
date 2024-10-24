import java.util.*;

public class Solution_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i];

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }

public static void main(String[] args){
    Solution_15 sol = new Solution_15();

        int [] nums1 = {-1,0,1,2,-1,-4};
        List<List<Integer>> result1 = sol.threeSum(nums1);
        System.out.println(result1); // Output: [-1,-1,2],[-1,0,1]]
        
        int [] nums2 = {0,1,1};
        List<List<Integer>> result2 = sol.threeSum(nums2);
        System.out.println(result2); // Output: []

        int [] nums3 = {0,0,0};
        List<List<Integer>> result3 = sol.threeSum(nums2);
        System.out.println(result3); // Output: [0,0,0]
    }
}
