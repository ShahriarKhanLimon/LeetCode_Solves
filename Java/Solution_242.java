import java.util.HashMap;

public class Solution_242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charCountMap.put(s.charAt(i), charCountMap.getOrDefault(s.charAt(i), 0) + 1);
            charCountMap.put(t.charAt(i), charCountMap.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int count : charCountMap.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Solution_242 solution = new Solution_242();

        String s1 = "anagram", t1 = "nagaram";
        System.out.println(solution.isAnagram(s1, t1)); // true

        String s2 = "rat", t2 = "car";
        System.out.println(solution.isAnagram(s2, t2)); // false

        String s3 = "bat", t3 = "cat";
        System.out.println(solution.isAnagram(s3, t3)); // false
    }
}
