public class Solution_28 {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Solution_28 solution = new Solution_28();

        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        String haystack2 = "leetcode";
        String needle2 = "leeto";

        System.out.println(solution.strStr(haystack1, needle1));  // Output: 0
        System.out.println(solution.strStr(haystack2, needle2));  // Output: -1

    }
}
