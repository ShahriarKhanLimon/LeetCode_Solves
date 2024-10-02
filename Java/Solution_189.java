public class Solution_189 {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);   
        reverse(nums, 0, k-1);   
        reverse(nums, k, n-1);   
    }

    public static void reverse(int[] nums, int start, int end){
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        
        // Example 1
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        System.out.println("Original array 1: ");
        printArray(nums1);
        rotate(nums1, k1);
        System.out.println("Rotated array 1: ");
        printArray(nums1);

        // Example 2
        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        System.out.println("Original array 2: ");
        printArray(nums2);
        rotate(nums2, k2);
        System.out.println("Rotated array 2: ");
        printArray(nums2);
    }

    // Helper function to print an array
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}