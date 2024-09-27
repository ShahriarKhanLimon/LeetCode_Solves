import java.util.Arrays;
public class Solution_88 {
    public static void main (String[] args){
        int nums1 [] = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int nums2 [] = {2, 5, 6};
        int n = 3;

        Solution solution = new Solution();

        System.out.println("Initial nums1: " + Arrays.toString(nums1));
        System.out.println("Initial nums2: " + Arrays.toString(nums2));

        solution.merge(nums1, m, nums2, n);

        System.out.println("After merge, nums2: " + Arrays.toString(nums1));
    }
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } 
            else{
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p--;
            p2--;
        }
    }
}