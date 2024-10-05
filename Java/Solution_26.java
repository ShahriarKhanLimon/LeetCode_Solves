class Solution_26 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int k = 1; // At least one unique element exists in a non-empty array

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array
        // int[] expectedNums = {0,1,2,3,4}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

        System.out.println("k = " + k);
    
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}