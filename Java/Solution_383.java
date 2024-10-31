public class Solution_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26];

        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (charCount[c - 'a'] == 0) {
                return false;
            }
            charCount[c - 'a']--;
        }

        return true;
    }
    public static void main(String[] args) {
        Solution_383 solution = new Solution_383();

        String ransomNote1 = "a", magazine1 = "b";
        System.out.println(solution.canConstruct(ransomNote1, magazine1));

        String ransomNote2 = "aa", magazine2 = "ab";
        System.out.println(solution.canConstruct(ransomNote2, magazine2));

        String ransomNote3 = "aa", magazine3 = "aab";

        System.out.println(solution.canConstruct(ransomNote3, magazine3));
    }
}
