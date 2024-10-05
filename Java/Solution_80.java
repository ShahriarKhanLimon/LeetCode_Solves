class Solution_80 {
    public static int removeDuplicates(int[] nums) {
        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k-2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3}; // Input array
        // int[] expectedNums = {0,0,1,1,2,3,3,_,_}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

        System.out.println("k = " + k);
    
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}