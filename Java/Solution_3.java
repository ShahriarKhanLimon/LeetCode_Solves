import java.util.HashSet;
class Solution_3 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        
        // HashSet to store unique characters in the current window
        HashSet<Character> set = new HashSet<>();
        
        for (int right = 0; right < n; right++) {
            // If character is already in the set, shrink the window from the left
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            // Add the current character and update max length
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
