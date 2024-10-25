public class Solution_00 {
    public class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int minLength = Integer.MAX_VALUE;  // initialize to a large number
            int sum = 0;
            int left = 0;
    
            for (int right = 0; right < nums.length; right++) {
                sum += nums[right];
    
                while (sum >= target) {
                    minLength = Math.min(minLength, right - left + 1);
                    sum -= nums[left];
                    left++;
                }
            }
    
            return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
        }
    }    
}
