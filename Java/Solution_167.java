public class Solution_167 {
        public int[] twoSum(int[] numbers, int target) {
            int left = 0;
            int right = numbers.length -1;

            while (left < right) {
                int sum  = numbers[left] + numbers [right];

                if (sum == target) {
                    return new int [] {left + 1, right + 1};
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
            return new int [] {-1, -1}; // This line is never reached because the problem guarantees exactly one solution
        }

    public static void main(String[] args){
        Solution_167 sol = new Solution_167();

        int [] numbers1 = {2, 7, 11, 15};
        int target1 = 9;
        int [] result1 = sol.twoSum(numbers1, target1);

        System.out.println("[" + result1[0] + "," + result1[1] + "]"); // Output: Output: [1,2]
        
        int [] numbers2 = {2, 3, 4};
        int target2 = 6;
        int [] result2 = sol.twoSum(numbers2, target2);

        System.out.println("[" + result2[0] + "," + result2[1] + "]"); // Output: Output: [1,3]

        int [] numbers3 = {-1, 0};
        int target3 = -1;
        int [] result3 = sol.twoSum(numbers3, target3);
        
        System.out.println("[" + result3[0] + "," + result3[1] + "]");
    }
}
