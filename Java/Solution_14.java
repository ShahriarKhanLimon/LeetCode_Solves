public class Solution_14 {
    public String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0) {
            return " ";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix =prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return " ";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Solution_14 solution = new Solution_14();
        
        // Test case 1
        String[] strs1 = {"flower", "flow", "flight"};
        String result1 = solution.longestCommonPrefix(strs1);
        System.out.println("Longest Common Prefix of strs1: " + result1);  // Output: "fl"

        // Test case 2
        String[] strs2 = {"dog", "racecar", "car"};
        String result2 = solution.longestCommonPrefix(strs2);
        System.out.println("Longest Common Prefix of strs2: " + result2);  // Output: ""
        
        // Test case 3 (Edge case: no common prefix)
        String[] strs3 = {"apple", "apricot", "banana"};
        String result3 = solution.longestCommonPrefix(strs3);
        System.out.println("Longest Common Prefix of strs3: " + result3);  // Output: ""
        
        // Test case 4 (All strings are identical)
        String[] strs4 = {"same", "same", "same"};
        String result4 = solution.longestCommonPrefix(strs4);
        System.out.println("Longest Common Prefix of strs4: " + result4);  // Output: "same"
    }
}
