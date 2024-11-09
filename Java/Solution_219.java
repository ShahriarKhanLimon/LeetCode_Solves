import java.util.HashMap;
import java.util.Map;

public class Solution_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution_219 sol = new Solution_219();
        
        int[] nums1 = {1,2,3,1};
        int k1 = 3;
        System.out.println(sol.containsNearbyDuplicate(nums1, k1)); // Output: true

        int[] nums2 = {1,0,1,1};
        int k2 = 1;
        System.out.println(sol.containsNearbyDuplicate(nums2, k2)); // Output: true

        int[] nums3 = {1,2,3,1,2,3};
        int k3 = 2;
        System.out.println(sol.containsNearbyDuplicate(nums3, k3)); // Output: false
    }
}
