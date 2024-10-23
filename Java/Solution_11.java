public class Solution_11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else{
                right--;
            }
        }
        return maxArea;
    }

public static void main(String[] args){
    Solution_11 sol = new Solution_11();

        int [] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result1 = sol.maxArea(height1);
        System.out.println(result1); // Output: 49
        
        int [] height2 = {1, 1};
        int result2 = sol.maxArea(height2);
        System.out.println(result2); // Output: 1
    }
}
